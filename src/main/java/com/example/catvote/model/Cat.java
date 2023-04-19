package com.example.catvote.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cat")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double eloRating;
    private String photoUrl; 

    public Cat() {}

    public Cat(String name, String photoUrl) {
        this.name = name;
        this.eloRating = 1200;
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

    public double getEloRating() {
        return eloRating;
    }

    public void setEloRating(double d) {
        this.eloRating = d;
    }

    public String getPhotoUrl(){
        return photoUrl; 
    }

    public void setPhotoUrl(String photoUrl){
        this.photoUrl = photoUrl; 
    }
}
