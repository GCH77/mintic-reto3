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

    public CalificacionReserva() {
    }

    public CalificacionReserva(Long id, int score, String message, Reserva reservation) {
        this.id = id;
        this.score = score;
        this.message = message;
        this.reservation = reservation;
    }

    public CalificacionReserva(int score, String message, Reserva reservation) {
        this.score = score;
        this.message = message;
        this.reservation = reservation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Reserva getReservation() {
        return reservation;
    }

    public void setReservation(Reserva reservation) {
        this.reservation = reservation;
    }
}
