package com.example.mappingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mappingdemo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
