package com.example.project.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.WhereJoinTable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="buyers")
public class Buyer extends User {

    @OneToOne(mappedBy = "buyer", cascade = CascadeType.ALL)
    private Cart cart;

    @OneToOne
    @PrimaryKeyJoinColumn
    private User user;

    public void setUser(User user) {
        this.user = user;
    }


    @ManyToMany
    @JoinTable(
            name="transactions",
            joinColumns=@JoinColumn(name="BUYER_ID", referencedColumnName="ID"),
            inverseJoinColumns=@JoinColumn(name="LISTING_ID", referencedColumnName="ID"))
    private List<Listing> listings;


}
