package com.example.catvote.model;

import jakarta.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import jakarta.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cat")
public class Cat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private double eloRating;
    private String photoUrl; 

    public Cat() {}

    public Cat(String name, String photoUrl) {
        this.name = name;
        this.photoUrl = photoUrl; 
        this.eloRating = 1200;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
