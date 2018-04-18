package com.nikischultz.concertapp.model;

import javax.persistence.*;

@Entity
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int venueId;

    @ManyToMany
    private String venueName;

    private int capacity;
    private String address;
    private String food;
    private String alcohol;
    private String restrictions;

    public Venue() {

    }

    public Venue(String venueName, int capacity, String address, String food, String alcohol, String restrictions) {
        this.venueName = venueName;
        this.capacity = capacity;
        this.address = address;
        this.food = food;
        this.alcohol = alcohol;
        this.restrictions = restrictions;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }
}
