package com.finalproject.finalproject.entity.Destinations.Hotels;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HotelsController {

    @Autowired
    private HotelsRepository hotelsRepository;

    @GetMapping(path = "/hotels")
    public Iterable<Hotels> getAllHotels() {
        return hotelsRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Hotels getHotels(@PathVariable(value = "id") Integer id) {
        Optional<Hotels> hotels = hotelsRepository.findById(id);
        return hotels.get();
    }

    @PostMapping(path = "/")
    public Hotels createDestinations(@RequestBody Hotels hotels) {
        return hotelsRepository.save(hotels);
    }

}