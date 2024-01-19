package com.example.tutorial.microservice.controller;

import com.example.tutorial.microservice.model.TutorialesVO;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface TutorialesAPI {

    List<TutorialesVO> getAllTutorials();
    Optional<TutorialesVO> getTutorialById(String id);
    List<TutorialesVO> findByPublished();
    TutorialesVO save(TutorialesVO tutorialesVO);
    TutorialesVO updateTutorial(TutorialesVO tutorialesVO);
    ResponseEntity deleteTutorial(String id);
    ResponseEntity deleteAll();
}
