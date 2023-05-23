package com.bonier.springbootmicroservicio1hoja.de.servicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bonier.springbootmicroservicio1hoja.de.servicio.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{
    
}
