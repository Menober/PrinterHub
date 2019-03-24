package com.zpi.printerhub.entities;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "id_category")
    private Long idCategory;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public Category() {
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
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
}
