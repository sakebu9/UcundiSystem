package com.proyecto.demo.dominian;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class comidaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String nombre ;

    private String raza;

    private Integer precio;

    private String peso;

    private String marca;

    public comidaEntity() {

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

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public comidaEntity(String nombre, String raza, Integer precio, String peso, String marca) {
        this.nombre = nombre;
        this.raza = raza;
        this.precio = precio;
        this.peso = peso;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "comidaEntity [id=" + id + ", nombre=" + nombre + ", raza=" + raza + ", precio="
                + precio + ", peso=" + peso + ", marca=" + marca + "]";
    }
}
