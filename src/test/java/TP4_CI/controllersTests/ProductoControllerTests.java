package TP4_CI.controllersTests;

import TP4_CI.controllers.ProductoController;
import TP4_CI.entities.Producto;
import TP4_CI.services.ProductoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductoController.class)
public class ProductoControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductoServiceImpl productoService;

    @Test
    void testBusquedaPorNombre() throws Exception{

        String nombre = "camiseta";

        Producto producto = new Producto();
        producto.setNombre(nombre);

        List<Producto> listaEnviada = new ArrayList<>();
        listaEnviada.add(producto);

        //Simulamos la funcionalidad del service ya que no queremos probar eso seria que cuande se ejecuta la linea del primer parentesis
        // devuelva el objeto producto agregamos Collections.singletonList pq deberia ser una lista de productos pero este caso es uno solo

        when(productoService.busquedaPorNombre(nombre)).thenReturn(listaEnviada);

        //con mockMvc simulamos una peticion diciendole q es tipo get y pasando el path, los parametros y el tipo y luego chequeamos los valores

        mockMvc.perform(get("/producto/busquedaPorNombre")
                        .param("nombre", nombre)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nombre").value(nombre));
    }

}
