package com.example.reto3.calificacionReservas.model;

import com.example.reto3.reservas.model.Reserva;

import javax.persistence.*;

@Entity
@Table
public class CalificacionReserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int score;
    private String message;

    @ManyToOne
    @JoinColumn(name = "reserva_id", insertable = false, updatable = false)
    private Reserva reservation;

}
