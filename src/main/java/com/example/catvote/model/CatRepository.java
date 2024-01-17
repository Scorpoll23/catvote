package com.example.catvote.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {

    List<Cat> getRandomCatPair();

    List<Cat> findTopCats(int count);
}
