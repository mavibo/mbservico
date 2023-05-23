package com.bonier.springbootmicroservicio1hoja.de.servicio.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    //fecha creacion del evento
    @Column(name = "creation_date")
    private LocalDateTime creationDate;
    
    //fecha inicio de evento por el colaborador
    @Column(name = "start_date")
    private LocalDateTime startDate;

    //fecha finalizacion del evento
    @Column(name = "end_date")
    private LocalDateTime endDate;

    //estado del evento pendiente, encurso, finalizado
    @Column(name = "status")
    private String status;

    //nombre del evento
    @Column(name = "name")
    private String name;

    //descripcion del evento por el cliente
    @Column(name = "description")
    private String description;

    //fotografia del problema del cliente si es necesario
    @Column(name = "picture")
    private String picture;

    //forma de realizacion de online u offline
    @Column(name = "type")
    private String offon;

    //responsable de darle solucion
    @Column(name = "collaborator")
    private String collaborator;

    //quine realiza asigan el evento
    @Column(name = "leader")
    private String leader;

    //prioridad
    @Column(name = "level")
    private String level;

    //nota del colaborador
    @Column(name = "note")
    private String note;

    //solaborador de apoyo
    @Column(name = "support")
    private String support;

    //finalizacion del evento finalizacion bien, incompleto, mal
    @Column(name = "completion_status")
    private String completion_status;

}
