package TP4_CI.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Entity
@NoArgsConstructor

public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private int id;

    @OneToMany(cascade = CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name = "productos")
    private List<Producto> productos;

    public List<Producto> getProductos() {
        return productos;
    }

    public void addProducto(Producto producto){
        this.productos.add(producto);
    }

    @Column(name = "name", nullable = false)
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

}
