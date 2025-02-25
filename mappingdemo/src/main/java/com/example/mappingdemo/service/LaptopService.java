package com.example.mappingdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mappingdemo.entity.Laptop;
import com.example.mappingdemo.repository.LaptopRepository;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    //create laptop
    public Laptop create(Laptop laptop) {
        if (laptop.getSpecification() != null) {
            laptop.getSpecification().setLaptop(laptop);
        }
        return laptopRepository.save(laptop);
    }

    //get all laptops
    public List<Laptop> getAll() {
        return laptopRepository.findAll();
    }

    //get laptop by id
    public Laptop getById(Long id) {
        return laptopRepository.findById(id).get();
    }

    
    

}
