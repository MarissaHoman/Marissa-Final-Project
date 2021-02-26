package com.finalproject.finalproject.entity.Destinations;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.finalproject.finalproject.entity.Destinations.Hotels.Hotels;

@Entity
@Table(name = "Destinations")
public class Destinations {

    /**
     *
     */
    private static final String DESTINATIONS_ID = "destinations_id";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = DESTINATIONS_ID, nullable = false)
    private Integer ID;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "state_name")
    private String stateName;

    @Column(name = "hotel_name")
    private String hotel_name;

    @Column(name = "rating")
    private Integer rating;

    @ManyToOne
    @JoinColumn(name = "hotels_id")
    private Integer id;

    @ManyToMany
    @JoinTable(name = "destinations_hotels", joinColumns = @JoinColumn(name = DESTINATIONS_ID), inverseJoinColumns = @JoinColumn(name = "hotels_id"))
    private List<Hotels> hotels;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    
    public Integer getRating() {
        return rating;
    }

    public Destinations(Integer id, String cityName, String stateName, String hotel_name, Integer rating,
            List<Hotels> hotels) {
        this.id = id;
        this.cityName = cityName;
        this.stateName = stateName;
        this.hotel_name = hotel_name;
        this.rating = rating;
        this.hotels = hotels;
    }

    public static String getDestinationsId() {
        return DESTINATIONS_ID;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public List<Hotels> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotels> hotels) {
        this.hotels = hotels;
    }
}

