package com.example.project.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="sellers")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String f_name;
    private String l_name;
    private String email;
    private String phone;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }


}