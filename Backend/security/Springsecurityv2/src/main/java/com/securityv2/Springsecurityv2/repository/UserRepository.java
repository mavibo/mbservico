package com.securityv2.Springsecurityv2.repository;

import java.util.Optional;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.securityv2.Springsecurityv2.model.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long>{

    //metodo 1 con la firma del metodo
    Optional<UserEntity> findByUsername(String username);

    //metodo 2 con la query
    //@Query("select u from UserEntity u where u.username = ?1")
    //Optional<UserEntity> getName(String username);
    
}
