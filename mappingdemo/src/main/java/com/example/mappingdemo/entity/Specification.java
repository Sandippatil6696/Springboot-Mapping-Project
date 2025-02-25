package com.example.mappingdemo.entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Specification {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String ram;
    private String hdd;
    private String color;

    /**
     * @JsonIgnore (Recommended)	Best for simple cases where the back-reference (laptop) is not needed in the response.
        @JsonManagedReference  /
        @JsonBackReference	Best when you need bidirectional serialization without recursion.
        @JsonIgnoreProperties	Alternative if you want more flexibility in ignoring fields dynamically.
     */

    // this is bi-directional mapping to also fetch laptop from specification class
    @OneToOne
    @JoinColumn(name = "laptop_id")
    private Laptop laptop;

}
