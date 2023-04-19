package com.example.catvote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.catvote.model.Cat;
import com.example.catvote.model.CatForm;
import com.example.catvote.model.CatRepository;

@Controller
public class CatFormController {

    @Autowired
    private CatRepository catRepository;

    @GetMapping("/cats/new")
    public String showCatForm(Model model) {
        model.addAttribute("catForm", new CatForm());
        return "cat-form";
    }

    @PostMapping("/cats/new")
    public String addCat(@ModelAttribute CatForm catForm) {
        Cat cat = new Cat(catForm.getName(), catForm.getPhotoUrl());
        catRepository.save(cat);
        return "redirect:/cats/new";
    }
}

