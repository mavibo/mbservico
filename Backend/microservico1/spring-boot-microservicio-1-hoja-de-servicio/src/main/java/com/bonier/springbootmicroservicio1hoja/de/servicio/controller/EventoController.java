package com.bonier.springbootmicroservicio1hoja.de.servicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bonier.springbootmicroservicio1hoja.de.servicio.model.Evento;
import com.bonier.springbootmicroservicio1hoja.de.servicio.service.EventoService;


@RestController
@RequestMapping("api/evento")
@CrossOrigin("*")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @PostMapping("/")
    public ResponseEntity<?> saveEvento(@RequestBody Evento evento){
        return new ResponseEntity<>( eventoService.savEvento(evento), HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<?> updatEvento(@RequestBody Evento evento){
        return new ResponseEntity<>(eventoService.savEvento(evento), HttpStatus.OK);
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<?> deletEvento(@PathVariable Long Id){
        eventoService.deletEvento(Id);
        return new ResponseEntity<>(HttpStatus.OK );
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllEvento(){
        return new ResponseEntity<>(eventoService.getAllEventos(), HttpStatus.OK);
    }

    @GetMapping("/{Id}")
    public ResponseEntity<?> getEventoId(@PathVariable ("Id") Long Id) {
        return new ResponseEntity<>(eventoService.getEventoById(Id), HttpStatus.OK);
    }
    
}