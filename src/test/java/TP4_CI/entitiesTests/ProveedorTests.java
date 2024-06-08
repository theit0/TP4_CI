package TP4_CI.entitiesTests;

import TP4_CI.entities.Producto;
import TP4_CI.entities.Proveedor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProveedorTests {


    @Test //Tercer test Pedro
    void testGetProductos(){
        Producto producto = new Producto();
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(producto);
        Proveedor proveedor = new Proveedor(1,listaProductos);
        assertEquals(true,proveedor.getProductos().contains(producto));
    }

}
