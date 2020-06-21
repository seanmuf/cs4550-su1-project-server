package com.example.project.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="stores")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(optional = false, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="sid")
    private Seller seller;

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL)
    private List<Listing> listings;

    public void addToStore(Listing listing) {
        listings.add(listing);
    }

    public Integer getId() {
        return id;
    }

    public List<Listing> getListings() {
        return listings;
    }

    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }
}
