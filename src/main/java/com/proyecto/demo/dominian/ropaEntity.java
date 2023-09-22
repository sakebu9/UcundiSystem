package com.proyecto.demo.dominian;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ropaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String nombre ;

    private String raza;

    private Integer precio;

    private String color;

    private String marca;

    public ropaEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ropaEntity(String nombre, String size, String raza, Integer precio, String color, String marca) {
        this.nombre = nombre;
        this.raza = raza;
        this.precio = precio;
        this.color = color;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "ropaEntity [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", precio="
                + precio + ", color=" + color + ", marca=" + marca + "]";
    }
}
