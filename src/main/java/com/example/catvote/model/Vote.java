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
    private Long loser_id;
    private Long winner_id;

    public Vote() {}

    public Vote(Long loser_id, Long winner_id) {
        this.loser_id = loser_id;
        this.winner_id = winner_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLoser_id() {
        return loser_id;
    }

    public void setLoser_id(Long loser_id) {
        this.loser_id = loser_id;
    }

    public Long getWinner_id() {
        return winner_id;
    }

    public void setWinner_id(Long winner_id) {
        this.winner_id = winner_id; 
    }
}

