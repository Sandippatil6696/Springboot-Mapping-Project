package com.example.mappingdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mappingdemo.entity.Student;
import com.example.mappingdemo.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentrepository;


    //creta student
    public Student create(Student student) {
        if (student.getAddresses() != null && !student.getAddresses().isEmpty()) {
            student.getAddresses().forEach(address -> address.setStudent(student));
        }
        return studentrepository.save(student);
    }

    //get all student
    public List<Student> getAll(){
        return studentrepository.findAll();
    }

    //getbyid
    public Student getbyId(Long id){
        return studentrepository.findById(id).get();
    }

}
