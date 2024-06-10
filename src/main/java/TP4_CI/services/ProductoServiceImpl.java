package TP4_CI.services;

import TP4_CI.entities.Producto;
import TP4_CI.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    ProductoRepository productoRepository;
    @Override
    public List<Producto> busquedaPorNombre(String nombre) throws Exception {
        try {
            List<Producto> productos = productoRepository.busquedaPorNombre(nombre);
            return productos;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }
}

