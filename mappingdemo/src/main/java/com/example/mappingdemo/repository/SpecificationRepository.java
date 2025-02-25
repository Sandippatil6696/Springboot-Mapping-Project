package com.example.mappingdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mappingdemo.entity.Specification;

@Repository
public interface SpecificationRepository  extends JpaRepository<Specification, Long> {

}
