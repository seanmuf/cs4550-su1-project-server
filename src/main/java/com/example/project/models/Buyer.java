package com.example.project.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="buyers")
public class Buyer {
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

    @ManyToMany
    @JoinTable(
            name="transactions",
            joinColumns=@JoinColumn(name="BUYER_ID", referencedColumnName="ID"),
            inverseJoinColumns=@JoinColumn(name="LISTING_ID", referencedColumnName="ID"))
    private List<Listing> listings;

}
