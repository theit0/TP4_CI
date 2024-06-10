package TP4_CI.services;

import TP4_CI.entities.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> busquedaPorNombre(String nombre) throws Exception;
}
