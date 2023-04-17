package com.example.catvote.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.catvote.model.Cat;
import com.example.catvote.model.CatRepository;
import com.example.catvote.model.Vote;
import com.example.catvote.model.VoteRepository;
import com.example.catvote.service.EloCalculator;

@Controller
public class CatController {

    @Autowired
    private CatRepository catRepository;

    @Autowired
    private VoteRepository voteRepository;

    @Autowired
    private EloCalculator eloCalculator;

    @GetMapping("/")
    public ModelAndView showCatPair() {
        ModelAndView mav = new ModelAndView("cat_pair");
        List<Cat> catPair = catRepository.getRandomCatPair();
        mav.addObject("cat1", catPair.get(0));
        mav.addObject("cat2", catPair.get(1));
        return mav;
    }

    @PostMapping("/vote")
    public ModelAndView processVote(@RequestParam("winnerId") Long winnerId,
                                     @RequestParam("loserId") Long loserId) {
        Cat winner = catRepository.findById(winnerId).get();
        Cat loser = catRepository.findById(loserId).get();
        eloCalculator.updateRating(winnerId, loserId);
        Vote vote = new Vote(winnerId, loserId);
        voteRepository.save(vote);
        catRepository.saveAll(List.of(winner, loser));
        return new ModelAndView("redirect:/");
    }
}

