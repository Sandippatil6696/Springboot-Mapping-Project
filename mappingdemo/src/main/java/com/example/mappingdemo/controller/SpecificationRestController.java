package com.example.mappingdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mappingdemo.entity.Specification;
import com.example.mappingdemo.service.SpecificationService;



@RestController
@RequestMapping("/specification")
public class SpecificationRestController {

    @Autowired
    private SpecificationService specificationservice;

    //rest api for get all specification
    @GetMapping
    public List<Specification> getAllSpecification() {
        return specificationservice.getAll();
    }

    
    @GetMapping("/{id}")
    public Specification getSpecificationById(@PathVariable Long id) {
        return specificationservice.getById(id);
    }
    

    

}
