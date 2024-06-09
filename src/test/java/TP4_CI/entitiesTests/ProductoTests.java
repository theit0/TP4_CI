package TP4_CI.entitiesTests;

import TP4_CI.entities.Producto;
import TP4_CI.services.ProductoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProductoTests {
    @Test //Primer test Theo
    void testId() { 
        // Crear un nuevo objeto Producto
        Producto producto = new Producto();
        // Verificar que el id por defecto es 0
        assertEquals(0, producto.getId());
    }

    @Test //Segundo test Theo
    void testGetId() { 
        // Crear un nuevo objeto Producto
        Producto producto = new Producto();
        // Establecer el id del producto
        producto.setId(1);
        // Obtener el id del producto
        int result = producto.getId();
        // Verificar que el id es el esperado
        assertEquals(1, result);
    }

    @Test // Tercer test Theo
    void testSetId() {
        // Crear un nuevo objeto Producto
        Producto producto = new Producto();
        // Establecer el id del producto
        producto.setId(5);
        // Verificar que el id se ha establecido correctamente
        assertEquals(5, producto.getId());
    }


    @Test //Primer test Pedro
    void testGetName(){
        Producto producto = new Producto();
        producto.setName("TestName");
        String nameTest = producto.getName();
        assertEquals("TestName", nameTest);
    }

    @Test //Segundo test Pedro
    void testSetName(){
        Producto producto = new Producto();
        producto.setName("TestName");
        assertEquals("TestName",producto.getName());
    }

    @Test
    void testStockMayorStockseguridad(){
        boolean StockValido = Producto.revisarstock(4,3);
        assertTrue(StockValido);
    }

    @Test
    void testStockIgualStockseguridad(){
        boolean StockValido = Producto.revisarstock(3,3);
        assertTrue(StockValido);
    }

    @Test
    void testStockMenorStockseguridad(){
        boolean StockValido = Producto.revisarstock(2,3);
        assertFalse(StockValido);
    }

    @Test
    void testNombreClaseProducto(){
        Producto producto1 = new Producto();
        assertNotNull(producto1);
    }
}
