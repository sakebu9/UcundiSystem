package com.proyecto.demo.dominian;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class camasEntity {
    @Id
    private Long id;

    private String nombre ;

    private String size;

    private String tipo;

    private String precio;

    private String color;

}
