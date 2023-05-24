package com.bonier.springbootmicroservicio1hoja.de.servicio.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bonier.springbootmicroservicio1hoja.de.servicio.model.Evento;
import com.bonier.springbootmicroservicio1hoja.de.servicio.repository.EventoRepository;
import com.bonier.springbootmicroservicio1hoja.de.servicio.service.EventoService;

@Service
public class EventoServiceImpl implements EventoService{

    @Autowired
    private EventoRepository eventoRepository;

    @Override
    public Evento savEvento(Evento evento) {
        evento.setCreationDate(LocalDateTime.now());
        return eventoRepository.save(evento);
    }

    @Override
    public Evento updatEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    @Override
    public List<Evento> getAllEventos() {
        return eventoRepository.findAll();
    }

    @Override
    public Evento gEventoById(Long id) {
        return eventoRepository.findById(id).get();
    }

    @Override
    public void deletEvento(Long id) {
        eventoRepository.deleteById(id);
    }
    
}
