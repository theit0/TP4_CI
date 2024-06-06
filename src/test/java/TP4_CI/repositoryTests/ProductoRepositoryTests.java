package TP4_CI.repositoryTests;

import TP4_CI.entities.Producto;
import TP4_CI.repositories.ProductoRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class ProductoRepositoryTests {
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private ProductoRepository productoRepository;

    @Test
    void testBusquedaPorNombre() throws Exception{
        Producto producto = new Producto();
        producto.setNombre("camiseta");

        List<Producto> listaEnviada = new ArrayList<>();
        listaEnviada.add(producto);

        // Persiste el producto en la base de datos
        entityManager.persist(producto);
        entityManager.flush();

        assertEquals(listaEnviada,productoRepository.busquedaPorNombre("camiseta"));
    }
}
