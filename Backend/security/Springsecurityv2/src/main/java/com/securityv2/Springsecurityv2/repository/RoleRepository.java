package com.securityv2.Springsecurityv2.repository;

import org.springframework.data.repository.CrudRepository;

import com.securityv2.Springsecurityv2.model.RoleEntity;


public interface RoleRepository extends CrudRepository<RoleEntity, Long>{
    
}
