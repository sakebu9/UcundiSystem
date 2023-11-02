package com.proyecto.demo.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.proyecto.demo.dominian.userEntity;

public interface userRepositories extends CrudRepository<userEntity, Long> {
   
    userEntity findByEmail(@Param(("email"))String email);

}
