package com.example.reto3.categorias.model;

import com.example.reto3.disfraces.model.Disfraz;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Disfraz> customes;

    public Categoria() {
    }

    public Categoria(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Categoria(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Disfraz> getCustomes() {
        return customes;
    }

    public void setCustomes(List<Disfraz> customes) {
        this.customes = customes;
    }
}
	/*[
        {
            "id":1,
            "name":"hero",
            "description":"superhero costume",
            "costumes":[]
        }
    ]*/