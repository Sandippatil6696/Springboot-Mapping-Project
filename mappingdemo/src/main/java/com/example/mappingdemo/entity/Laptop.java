package com.example.mappingdemo.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String model;
    private String manufacturer;
    private LocalDate manufacturingDate;
    private double screenSize;
    private String processor;
    private double weight;
    private double price;
    private boolean istouchscreen;

    // if we declare mapping in only one class then it would be unidirectional mapping 
    // to fetch specification from laptop class we mapped one to one relationship
    // mappedby this will generate a foreign keys only in specification table as column name laptopid 
    // cascadetype if we want to save or all operation on laptop and its specification along with laptop use cascade.all
    // if we save laptop it will also save its specification if we use cascade propetties
    @OneToOne(mappedBy = "laptop" , cascade = CascadeType.ALL)
    private Specification specification;


    public void setSpecification(Specification specification) {
        this.specification = specification;
        specification.setLaptop(this); // Ensure bidirectional relationship is set
    }
    

}
