package com.proyecto.demo.dominian;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class combosEntity {
    @Id
    private String nombre;
    private Long id;
    private Integer precio;
    private Float descuento;
    private long idP1;
    private long idP2;
    private long idP3;
    
    @Override
    public String toString() {
        return "combosEntity [nombre=" + nombre + ", id=" + id + ", precio=" + precio + ", descuento=" + descuento
                + ", idP1=" + idP1 + ", idP2=" + idP2 + ", idP3=" + idP3 + "]";
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public Float getDescuento() {
        return descuento;
    }
    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }
    public long getIdP1() {
        return idP1;
    }
    public void setIdP1(long idP1) {
        this.idP1 = idP1;
    }
    public long getIdP2() {
        return idP2;
    }
    public void setIdP2(long idP2) {
        this.idP2 = idP2;
    }
    public long getIdP3() {
        return idP3;
    }
    public void setIdP3(long idP3) {
        this.idP3 = idP3;
    }
    public combosEntity() {

    }
    
    public combosEntity(String nombre,  Integer precio, Float descuento, long idP1, long idP2, long idP3) {
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
        this.idP1 = idP1;
        this.idP2 = idP2;
        this.idP3 = idP3;
    }
    
}
