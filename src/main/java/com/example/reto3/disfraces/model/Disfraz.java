package com.example.reto3.disfraces.model;

import com.example.reto3.categorias.model.Categoria;
import com.example.reto3.mensajes.model.Mensaje;
import com.example.reto3.reservas.model.Reserva;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Disfraz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String brand;
    private int year;
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonIgnoreProperties("costumes")
    private Categoria category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "costume")
    @JsonIgnoreProperties({"costume","client"})
    private List<Mensaje> messages;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "costume")
    @JsonIgnoreProperties({"costume"})
    private List<Reserva> reservations;

    public Disfraz() {
    }

    public Disfraz(Long id, String brand, int year, String name, String description, Categoria category) {
        this.id = id;
        this.brand = brand;
        this.year = year;
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public Disfraz(String brand, int year, String name, String description, Categoria category) {
        this.brand = brand;
        this.year = year;
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Categoria getCategory() {
        return category;
    }

    public void setCategory(Categoria category) {
        this.category = category;
    }

    public List<Mensaje> getMessages() {
        return messages;
    }

    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }

    public List<Reserva> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reserva> reservations) {
        this.reservations = reservations;
    }
}
	/*[
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
            "messages":[],
            "reservations":[]
        }
    ]*/