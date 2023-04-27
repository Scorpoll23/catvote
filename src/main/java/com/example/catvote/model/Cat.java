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
    private double elo_Rating;
    private String photo_Url; 

    public Cat() {}

    public Cat(String name, String photo_Url) {
        this.name = name;
        this.photo_Url = photo_Url; 
        this.elo_Rating = 1200;
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

    public double getElo_Rating() {
        return elo_Rating;
    }

    public void setElo_Rating(double d) {
        this.elo_Rating = d;
    }

    public String getPhoto_Url(){
        return photo_Url; 
    }

    public void setPhoto_Url(String photo_Url){
        this.photo_Url = photo_Url; 
    }
}
