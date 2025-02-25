package com.example.mappingdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mappingdemo.entity.Specification;
import com.example.mappingdemo.repository.SpecificationRepository;

@Service
public class SpecificationService {

    @Autowired
    private SpecificationRepository specificationRepository;


    //get all specification
    public List<Specification> getAll() {
        return specificationRepository.findAll();
    }

    //get specification by id
    public Specification getById(Long id) {
        return specificationRepository.findById(id).get();
    }
    

}
