package com.example.reto3.reservas.model;

import com.example.reto3.calificacionReservas.model.CalificacionReserva;
import com.example.reto3.clientes.model.Cliente;
import com.example.reto3.disfraces.model.Disfraz;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    @ManyToOne
    @JoinColumn(name = "disfraz_id", insertable = false, updatable = false)
    private Disfraz custome;

    @ManyToOne
    @JoinColumn(name = "cliente_id", insertable = false, updatable = false)
    private Cliente client;

    private LocalDate startDate;
    private LocalDate devolutionDate;
    private String status;

    @OneToMany(mappedBy = "reservation")
    private List<CalificacionReserva> score;

    public Reserva() {
    }

    public Reserva(Long idReservation, Disfraz custome, Cliente client, LocalDate startDate, LocalDate devolutionDate) {
        this.idReservation = idReservation;
        this.custome = custome;
        this.client = client;
        this.startDate = startDate;
        this.devolutionDate = devolutionDate;
    }

    public Reserva(Disfraz custome, Cliente client, LocalDate startDate, LocalDate devolutionDate) {
        this.custome = custome;
        this.client = client;
        this.startDate = startDate;
        this.devolutionDate = devolutionDate;
    }

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public Disfraz getCustome() {
        return custome;
    }

    public void setCustome(Disfraz custome) {
        this.custome = custome;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(LocalDate devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CalificacionReserva> getScore() {
        return score;
    }

    public void setScore(List<CalificacionReserva> score) {
        this.score = score;
    }
}


	    /*[
            {
                "idReservation":1,
                "startDate":"2020-12-20T00:00:00.000+00:00",
                "devolutionDate":"2020-12-20T00:00:00.000+00:00",
                "status":"created",
                "costume":
                    {
                        "id":1,
                        "name":"Superman",
                        "brand":"DC",
                        "year":2021,
                        "description":"superman costume",
                        "category":
                            {
                                "id":1,
                                "name":"hero",
                                "description":"superhero costume"
                            },
                        "messages":[
                                {
                                    "idMessage":1,
                                    "messageText":"Me gusta."
                                }
                        ]
                    },
                "client":
                    {
                        "idClient":1,
                        "email":"agustin@gmail.com",
                        "password":"agustin123",
                        "name":"Agustin Parra",
                        "age":18
                    },
                "score":null
            }
        ]*/