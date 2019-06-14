package it.k2.formazione.bookstore.model;

import javax.persistence.*;

@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "description")
    private String description;


    public Publisher() {}

    public Publisher(Integer id, String description) {
        this.id = id;
        this.description = description;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}