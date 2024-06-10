package TP4_CI.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    private String nombre;

    public String getNombre() { return  this.nombre;}
    public void setNombre(String n) {this.nombre = n;}

    public static boolean revisarstock(int a, int b){
        return a >= b;
    }

}
