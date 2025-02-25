package com.example.mappingdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mappingdemo.entity.Laptop;
import com.example.mappingdemo.service.LaptopService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/laptops")
public class LaptopRestController {

    @Autowired
    private LaptopService laptopService;

    //restapi for create laptop
    @PostMapping()
    public Laptop creteLaptop(@RequestBody Laptop laptop) {
        return laptopService.create(laptop);
    }

    //get all laptops
    @GetMapping()
    public List<Laptop> getAllLaptops() {
        return laptopService.getAll();
    }
    
    // get laptop by id
    @GetMapping("/{id}")
    public Laptop getLaptopById(@PathVariable Long id) {
        return laptopService.getById(id);
    }



}
