package com.event.management.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.management.model.VenueModel;
import com.event.management.repositories.VenueRepo;

@Service
public class VenueService {
	
	@Autowired
	VenueRepo venueRepository;
	public VenueModel createVenue(VenueModel venue) {
        return venueRepository.save(venue);
    }

    public Optional<VenueModel> getVenueById(Long id) {
        return venueRepository.findById(id);
    }

    public VenueModel updateVenue(Long id, VenueModel venueDetails) {
        VenueModel venue = venueRepository.findById(id).orElseThrow();
        venue.setName(venueDetails.getName());
        venue.setLocation(venueDetails.getLocation());
        venue.setCapacity(venueDetails.getCapacity());
        return venueRepository.save(venue);
    }

    public void deleteVenue(Long id) {
        venueRepository.deleteById(id);
    }
}

