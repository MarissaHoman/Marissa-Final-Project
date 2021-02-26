package com.finalproject.finalproject.entity.Destinations.Hotels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotels {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hotels_id")
    private Integer id;

    @Column(name = "hotel_name")
    private String hotelName;

    @Column(name = "rating")
    private Integer rating;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Hotels(Integer id, String hotelName, Integer rating) {
        this.id = id;
        this.hotelName = hotelName;
        this.rating = rating;
    }
}
