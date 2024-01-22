package com.example.tutorial.microservice.repository;

import com.example.tutorial.microservice.model.TutorialesVO;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TutorialesRepository extends MongoRepository<TutorialesVO, String> {
    List<TutorialesVO> findByPublishedTrue();
    List<TutorialesVO> findByTitleContaining(String title);
}
