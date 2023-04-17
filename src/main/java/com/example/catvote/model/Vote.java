package com.example.catvote.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vote")
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cat_id_1;
    private Long cat_id_2;
    private Long winner_id;

    public Vote() {}

    public Vote(Long cat_id_1, Long cat_id_2, Long winner_id) {
        this.cat_id_1 = cat_id_1;
        this.cat_id_2 = cat_id_2;
        this.winner_id = winner_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCat_id_1() {
        return cat_id_1;
    }

    public void setCat_id_1(Long cat_id_1) {
        this.cat_id_1 = cat_id_1;
    }

    public Long getCat_id_2() {
        return cat_id_2;
    }

    public void setCat_id_2(Long cat_id_2) {
        this.cat_id_2 = cat_id_2;
    }

    public Long getWinner_id() {
        return winner_id;
    }

    public void setWinner_id(Long winner_id) {
        this.winner_id = winner_id; 
    }
}

