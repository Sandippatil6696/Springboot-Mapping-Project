package com.example.mappingdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mappingdemo.entity.Student;
import com.example.mappingdemo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/student")
public class StudentRestController {

    @Autowired
    private StudentService studentservice ;

    //create rest api for create student 
    @PostMapping()
    public Student createStudent(@RequestBody Student student) {
       return studentservice.create(student);
        
    }

    //get all
    @GetMapping()
    public List<Student> getAllStuduent() {
        return studentservice.getAll();
    }


    // get by id
    @GetMapping("{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentservice.getbyId(id);
    }
    
    
    

}
