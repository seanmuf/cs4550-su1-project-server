package com.example.project.models;

import org.hibernate.annotations.WhereJoinTable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="sellers")
public class Seller extends User {
    private Integer storeId;


    @OneToOne(mappedBy = "seller")
    private Store store;

    @OneToOne
    @PrimaryKeyJoinColumn
    private User user;

    public void setUser(User user) {
        this.user = user;
    }


}