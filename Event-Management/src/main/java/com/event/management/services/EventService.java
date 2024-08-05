package com.event.management.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.management.model.EventModel;
import com.event.management.repositories.EventRepo;

@Service
public class EventService {

	@Autowired
	EventRepo eventRepository;
	
	 public EventModel createEvent(EventModel event) {
	        return eventRepository.save(event);
	    }

	    public List<EventModel> getAllEvents() {
	        return eventRepository.findAll();
	    }

	    public Optional<EventModel> getEventById(Long id) {
	        return eventRepository.findById(id);
	    }
	    
	    public EventModel updateEvent(Long id, EventModel eventDetails) {
	        EventModel event = eventRepository.findById(id).orElseThrow();
	        event.setEventName(eventDetails.getEventName());
	        event.setEventDate(eventDetails.getEventDate());
	        event.setDescription(eventDetails.getDescription());
	        event.setOrganizer(eventDetails.getOrganizer());
	        event.setVenue(eventDetails.getVenue());
	        return eventRepository.save(event);
	    }

	    public void deleteEvent(Long id) {
	        eventRepository.deleteById(id);
	    }

	    public List<EventModel> getEventsByVenue(Long venueId) {
	        return eventRepository.findByVenue_Id(venueId);
	    }

	    public List<EventModel> getEventsByOrganizer(Long organizerId) {
	        return eventRepository.findByOrganizer_Id(organizerId);
	    }
	}

