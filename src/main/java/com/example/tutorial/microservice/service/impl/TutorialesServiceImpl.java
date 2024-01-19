package com.example.tutorial.microservice.service.impl;

import com.example.tutorial.microservice.model.TutorialesVO;
import com.example.tutorial.microservice.repository.TutorialesRepository;
import com.example.tutorial.microservice.service.TutorialesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Optional;

@Service
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
        try {
            tutorialesRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } catch (EmptyResultDataAccessException e){
            return ResponseEntity.notFound().build();
        }
    }

    @Override
    public ResponseEntity deleteAll() {
        try {
            tutorialesRepository.deleteAll();
            return ResponseEntity.ok().build();
        } catch (EmptyResultDataAccessException e){
            return ResponseEntity.notFound().build();
        }
    }
}
