package com.event.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.management.model.VenueModel;
import com.event.management.services.VenueService;

@RestController
@RequestMapping("/venues")
public class VenueContro {



    @Autowired
    private VenueService venueService;

    @PostMapping
    public VenueModel createVenue(@RequestBody VenueModel venue) {
        return venueService.createVenue(venue);
    }

    @GetMapping("/getVenue/{id}")
    public ResponseEntity<VenueModel> getVenueById(@PathVariable Long id) {
        return venueService.getVenueById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/updateVenue/{id}")
    public ResponseEntity<VenueModel> updateVenue(@PathVariable Long id, @RequestBody VenueModel venueDetails) {
        return ResponseEntity.ok(venueService.updateVenue(id, venueDetails));
    }

    @DeleteMapping("/deleteVenue/{id}")
    public ResponseEntity<Void> deleteVenue(@PathVariable Long id) {
        venueService.deleteVenue(id);
        return ResponseEntity.noContent().build();
    }
}

