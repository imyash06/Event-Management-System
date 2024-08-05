package com.event.management.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class EventModel {
	
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
	    private Long id;
	    private String eventName;
	    private LocalDateTime eventDate;
	    private String description;
	    
	    @ManyToOne
	    private OrganizerModel organizer;
	    
	    @ManyToOne
	    private VenueModel venue;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEventName() {
			return eventName;
		}

		public void setEventName(String eventName) {
			this.eventName = eventName;
		}

		public LocalDateTime getEventDate() {
			return eventDate;
		}

		public void setEventDate(LocalDateTime eventDate) {
			this.eventDate = eventDate;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public OrganizerModel getOrganizer() {
			return organizer;
		}

		public void setOrganizer(OrganizerModel organizer) {
			this.organizer = organizer;
		}

		public VenueModel getVenue() {
			return venue;
		}

		public void setVenue(VenueModel venue) {
			this.venue = venue;
		}

		@Override
		public String toString() {
			return "Event [id=" + id + ", eventName=" + eventName + ", eventDate=" + eventDate + ", description="
					+ description + ", organizer=" + organizer + ", venue=" + venue + ", getId()=" + getId()
					+ ", getEventName()=" + getEventName() + ", getEventDate()=" + getEventDate()
					+ ", getDescription()=" + getDescription() + ", getOrganizer()=" + getOrganizer() + ", getVenue()="
					+ getVenue() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}

		public EventModel(Long id, String eventName, LocalDateTime eventDate, String description, OrganizerModel organizer,
				VenueModel venue) {
			super();
			this.id = id;
			this.eventName = eventName;
			this.eventDate = eventDate;
			this.description = description;
			this.organizer = organizer;
			this.venue = venue;
		}

		public EventModel() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

}
