package com.lambdaschool.crudyrestaurants.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "payments")
public class Payment {
    //generate special id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;

    @Column(unique = true,nullable = false)
    private String type;

    /**
     * connecting restaurant to payments from line 71
     */
    @ManyToMany(mappedBy = "payments")
    private Set<Restaurant> restaurants= new HashSet<>();

    public Payment() {
    }

    /**
     * Constructor
     */
    public Payment(String type) {
        this.type = type;
    }

    /**
     * getters and setters
     */
    public long getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(long paymentid) {
        this.paymentid = paymentid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Set<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
