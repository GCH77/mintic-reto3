package com.example.reto3.mensajes.model;

import com.example.reto3.clientes.model.Cliente;
import com.example.reto3.disfraces.model.Disfraz;

import javax.persistence.*;

@Entity
@Table
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "cliente_id", insertable = false, updatable = false)
    private Cliente client;

    @ManyToOne
    @JoinColumn(name = "costume_id", insertable = false, updatable = false)
    private Disfraz costume;

    public Mensaje() {
    }

    public Mensaje(Long idMessage, String messageText, Cliente client, Disfraz costume) {
        this.idMessage = idMessage;
        this.messageText = messageText;
        this.client = client;
        this.costume = costume;
    }

    public Mensaje(String messageText, Cliente client, Disfraz costume) {
        this.messageText = messageText;
        this.client = client;
        this.costume = costume;
    }

    public Long getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Long idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public Disfraz getCostume() {
        return costume;
    }

    public void setCostume(Disfraz costume) {
        this.costume = costume;
    }
}
/*
[
    {
        "idMessage":1,
        "messageText":"Me gusta.",
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
                    }
            },
        "client":
            {
                "idClient":1,
                "email":"agustin@gmail.com",
                "password":"agustin123",
                "name":"Agustin Parra",
                "age":18
            }
    }
]*/
