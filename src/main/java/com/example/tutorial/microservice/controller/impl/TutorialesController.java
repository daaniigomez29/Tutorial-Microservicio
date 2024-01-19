package com.example.tutorial.microservice.controller.impl;

import com.example.tutorial.microservice.controller.TutorialesAPI;
import com.example.tutorial.microservice.model.TutorialesVO;
import com.example.tutorial.microservice.repository.TutorialesRepository;
import com.example.tutorial.microservice.service.TutorialesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class TutorialesController implements TutorialesAPI {

    @Autowired
    private TutorialesService tutorialesService;

    @Autowired
    private TutorialesRepository tutorialesRepository;

    @Override
    @GetMapping("/tutorials")
    public List<TutorialesVO> getAllTutorials(){return tutorialesService.getAllTutorials();}

    @Override
    @GetMapping("/tutorials/{id}")
    public Optional<TutorialesVO> getTutorialById(String id){return tutorialesService.getTutorialById(id);}


    @Override
    @GetMapping("/tutorials/published")
    public List<TutorialesVO> findByPublished(){return tutorialesService.findByPublished();}

    @Override
    @GetMapping("/tutorials")
    public TutorialesVO save(@RequestBody TutorialesVO tutorial){return tutorialesService.save(tutorial);}

    @Override
    @GetMapping("tutorials/{id}")
    public TutorialesVO updateTutorial(TutorialesVO tutorialesVO){
        if(!tutorialesRepository.findAll().contains(tutorialesVO)){
            return tutorialesService.updateTutorial(tutorialesVO);
        } else{
            return null;
        }
    }

    @Override
    @GetMapping("/tutorials/{id}")
    public ResponseEntity deleteTutorial(String id){return tutorialesService.deleteTutorial(id);}

    @Override
    @GetMapping("/tutorials")
    public ResponseEntity deleteAll(){return tutorialesService.deleteAll();}
}
