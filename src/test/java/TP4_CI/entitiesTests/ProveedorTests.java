package TP4_CI.entitiesTests;

import TP4_CI.entities.Producto;
import TP4_CI.entities.Proveedor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProveedorTests {


    @Test //Tercer test Pedro
    void testGetProductos(){
        Producto producto = new Producto();
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(producto);
        Proveedor proveedor = new Proveedor(1,listaProductos, null);
        assertEquals(true,proveedor.getProductos().contains(producto));
    }

    @Test //Primer Test Emi
    void testGetName(){
        Proveedor proveedor = new Proveedor();
        proveedor.setName("Testing");
        String nameTest = proveedor.getName();
        assertEquals("Testing", nameTest);

    }

    @Test //Segundo Test Emi
    void testSetName() {
        Proveedor proveedor = new Proveedor();
        proveedor.setName("Testing");
        assertEquals("Testing", proveedor.getName());
    }


}
