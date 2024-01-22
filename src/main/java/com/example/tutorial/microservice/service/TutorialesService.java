package com.example.tutorial.microservice.service;

import com.example.tutorial.microservice.model.TutorialesVO;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface TutorialesService {
    List<TutorialesVO> getAllTutorials();
    Optional<TutorialesVO> getTutorialById(String id);
    List<TutorialesVO> findByPublishedTrue();
    List<TutorialesVO> findByTitleContaining(String title);
    TutorialesVO save(TutorialesVO tutorial);
    TutorialesVO updateTutorial(TutorialesVO tutorial);
    ResponseEntity deleteTutorial(String id);
    ResponseEntity deleteAll();
}
