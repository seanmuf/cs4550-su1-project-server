package com.example.project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Entity
@Table(name="sellers")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String f_name;
    private String l_name;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "seller")
    private List<Listing> listing;

}