package com.finalproject.finalproject.entity.Destinations;

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
public class DestinationsController {

    @Autowired
    private DestinationsRepository destinationsRepository;

    @GetMapping(path = "/destinations")
    public Iterable<Destinations> getAllDestinations() {
        return destinationsRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Destinations getDestinations(@PathVariable(value = "id") Integer id) {
        Optional<Destinations> destinations = destinationsRepository.findById(id);
        return destinations.get();
    }

    @PostMapping(path = "/")
    public Destinations createDestinations(@RequestBody Destinations destinations) {
        return destinationsRepository.save(destinations);
    }

}
