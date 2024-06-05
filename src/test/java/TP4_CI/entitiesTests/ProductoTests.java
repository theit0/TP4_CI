package TP4_CI.entitiesTests;

import TP4_CI.entities.Producto;
import TP4_CI.services.ProductoServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ProductoTests {


    @Test //Primer test Theo
    void testId() {
        Producto producto = new Producto();
        assertEquals(0, producto.getId());
    }

    @Test //Segundo test Theo
    void testGetId() {
        Producto producto1 = new Producto();
        producto1.setId(1);
        int result = producto1.getId();
        assertEquals(1, result);
    }

    @Test //Tercer test Theo
    void testSetId() {
        Producto producto = new Producto();
        producto.setId(5);
        assertEquals(5, producto.getId());
    }




}
