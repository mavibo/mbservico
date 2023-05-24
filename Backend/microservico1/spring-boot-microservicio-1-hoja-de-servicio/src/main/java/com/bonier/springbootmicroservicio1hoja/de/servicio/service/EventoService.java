package com.bonier.springbootmicroservicio1hoja.de.servicio.service;

import java.util.List;

import com.bonier.springbootmicroservicio1hoja.de.servicio.model.Evento;

public interface EventoService {

    public Evento savEvento(Evento evento);

    public Evento updatEvento(Evento evento);

    public List<Evento>getAllEventos();
    
    public Evento gEventoById(Long id);

    public void deletEvento(Long id);

    
}
