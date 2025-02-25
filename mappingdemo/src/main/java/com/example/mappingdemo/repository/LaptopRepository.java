package com.example.mappingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mappingdemo.entity.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {

}
