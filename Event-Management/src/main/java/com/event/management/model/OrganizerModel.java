package com.event.management.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class OrganizerModel {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	 private Long id;
	 private String name;
	 private String contactInfo;
	 
	 @OneToMany(mappedBy = "organizer")
	  private List<EventModel> events;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	public List<EventModel> getEvents() {
		return events;
	}

	public void setEvents(List<EventModel> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "Organizer [id=" + id + ", name=" + name + ", contactInfo=" + contactInfo + ", events=" + events
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getContactInfo()=" + getContactInfo()
				+ ", getEvents()=" + getEvents() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public OrganizerModel(Long id, String name, String contactInfo, List<EventModel> events) {
		super();
		this.id = id;
		this.name = name;
		this.contactInfo = contactInfo;
		this.events = events;
	}

	public OrganizerModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}
