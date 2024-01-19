package com.example.tutorial.microservice.service.impl;

import com.example.tutorial.microservice.model.TutorialesVO;
import com.example.tutorial.microservice.repository.TutorialesRepository;
import com.example.tutorial.microservice.service.TutorialesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public class TutorialesServiceImpl implements TutorialesService {

    @Autowired
    private TutorialesRepository tutorialesRepository;

    @Override
    public List<TutorialesVO> getAllTutorials() {
        return tutorialesRepository.findAll();
    }

    @Override
    public Optional<TutorialesVO> getTutorialById(String id) {
        return tutorialesRepository.findById(id);
    }

    @Override
    public List<TutorialesVO> findByPublished() {
        return tutorialesRepository.findByPublished();
    }

    @Override
    public TutorialesVO save(TutorialesVO tutorial) {
        return tutorialesRepository.save(tutorial);
    }

    @Override
    public TutorialesVO updateTutorial(TutorialesVO tutorial) {
        return tutorialesRepository.save(tutorial);
    }

    @Override
    public ResponseEntity deleteTutorial(String id) {
        return null;
    }

    @Override
    public ResponseEntity deleteAll() {
        return null;
    }
}
