package com.proyecto.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.proyecto.demo.dominian.juguetesEntity;

public interface juguetesRepositories extends CrudRepository<juguetesEntity, Long> {
    
}
