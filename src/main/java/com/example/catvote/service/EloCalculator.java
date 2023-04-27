package com.example.catvote.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.catvote.model.Cat;
import com.example.catvote.model.CatRepository;

@Service
public class EloCalculator {

    private static final double K_FACTOR = 32.0;

    @Autowired
    private CatRepository catRepository;

    public void updateRating(Long winnerId, Long loserId) {
        Cat winner = catRepository.findById(winnerId).orElseThrow(() -> new NoSuchElementException("Cat not found with ID: " + winnerId));
        Cat loser = catRepository.findById(loserId).orElseThrow(() -> new NoSuchElementException("Cat not found with ID: " + loserId));
        
        double winnerRating = winner.getElo_Rating();
        double loserRating = loser.getElo_Rating();
        
        double winnerExpectedScore = 1.0 / (1.0 + Math.pow(10.0, (loserRating - winnerRating) / 400.0));
        double loserExpectedScore = 1.0 / (1.0 + Math.pow(10.0, (winnerRating - loserRating) / 400.0));
        
        winner.setElo_Rating(winnerRating + K_FACTOR * (1.0 - winnerExpectedScore));
        loser.setElo_Rating(loserRating + K_FACTOR * (0.0 - loserExpectedScore));
        
        catRepository.save(winner);
        catRepository.save(loser);
    }

}
