package com.proyecto.demo.dataInitial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.proyecto.demo.Repositories.aseoRepositories;
import com.proyecto.demo.Repositories.camasRepositories;
import com.proyecto.demo.Repositories.comidaRepositories;
import com.proyecto.demo.Repositories.juguetesRepositories;
import com.proyecto.demo.Repositories.ropaRepositories;
import com.proyecto.demo.dominian.aseoEntity;
import com.proyecto.demo.dominian.camasEntity;
import com.proyecto.demo.dominian.comidaEntity;
import com.proyecto.demo.dominian.juguetesEntity;
import com.proyecto.demo.dominian.ropaEntity;

@Component
public class PetStrapData implements CommandLineRunner {

    private final aseoRepositories aseoRepositorio;

    private final camasRepositories camaRepositorio;

    private final juguetesRepositories juguetesRepositorio;

    private final comidaRepositories comidaRepositorio;

    private final ropaRepositories ropaRepositorio;



 



    public PetStrapData(aseoRepositories aseoRepositorio,camasRepositories camaRepositorio,
            juguetesRepositories juguetesRepositorio, comidaRepositories comidaRepositorio,
            ropaRepositories ropaRepositorio) {
        this.aseoRepositorio = aseoRepositorio;
        this.camaRepositorio = camaRepositorio;
        this.juguetesRepositorio = juguetesRepositorio;
        this.comidaRepositorio = comidaRepositorio;
        this.ropaRepositorio = ropaRepositorio;
    }







    @Override
    public void run(String... args) throws Exception {
        camasEntity agregarCama1 = new camasEntity("King cama", "grande", "grande", 500000, "rojo", "King");
        camasEntity agregarCama2 = new camasEntity("King cama", "grande", "grande", 500000, "rojo", "King");
        camasEntity agregarCama3 = new camasEntity("King cama", "grande", "grande", 500000, "rojo", "King");

        camaRepositorio.save(agregarCama1);
        camaRepositorio.save(agregarCama2);
        camaRepositorio.save(agregarCama3);

        comidaEntity comida1 = new comidaEntity("Dogdood", "Grande", 100000, "1000g", "petfamily");
        comidaRepositorio.save(comida1);

        aseoEntity aseo1 = new aseoEntity("limpiaperro", 50000, "perroaseado");
        aseoRepositorio.save(aseo1);

        juguetesEntity juguete1 = new juguetesEntity("Pelota", 5000, "amarilla", "bubble");
        juguetesRepositorio.save(juguete1);

        ropaEntity ropa1 =  new ropaEntity("saco", "pequeño", "pequeña", 50000, "Azul", "mascotamigo");
        ropaRepositorio.save(ropa1);

        System.out.println("comida:" + comidaRepositorio.count());
    }
}
