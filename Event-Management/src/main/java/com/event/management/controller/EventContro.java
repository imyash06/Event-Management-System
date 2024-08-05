package com.event.management.controller;

import java.util.List;

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

import com.event.management.model.EventModel;
import com.event.management.services.EventService;

@RestController
@RequestMapping("/events")
public class EventContro {

	@Autowired
	private EventService eventService;

	@PostMapping
	public EventModel createEvent(@RequestBody EventModel event) {
		return eventService.createEvent(event);
	}

	@GetMapping
	public List<EventModel> getAllEvents() {
		return eventService.getAllEvents();
	}

	@GetMapping("/getEvent/{id}")
	public ResponseEntity<EventModel> getEventById(@PathVariable Long id) {
		return eventService.getEventById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

	@PutMapping("/updateEvent/{id}")
	public ResponseEntity<EventModel> updateEvent(@PathVariable Long id, @RequestBody EventModel eventDetails) {
		return ResponseEntity.ok(eventService.updateEvent(id, eventDetails));
	}

	@DeleteMapping("/deleteEvent/{id}")
	public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
		eventService.deleteEvent(id);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/venue/{venueId}")
	public List<EventModel> getEventsByVenue(@PathVariable Long venueId) {
		return eventService.getEventsByVenue(venueId);
	}

	@GetMapping("/organizer/{organizerId}")
	public List<EventModel> getEventsByOrganizer(@PathVariable Long organizerId) {
		return eventService.getEventsByOrganizer(organizerId);
	}
}
