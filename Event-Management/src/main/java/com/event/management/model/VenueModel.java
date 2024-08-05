package com.event.management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VenueModel {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String location;
	    private int capacity;
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
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		@Override
		public String toString() {
			return "Venue [id=" + id + ", name=" + name + ", location=" + location + ", capacity=" + capacity
					+ ", getId()=" + getId() + ", getName()=" + getName() + ", getLocation()=" + getLocation()
					+ ", getCapacity()=" + getCapacity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
		public VenueModel(Long id, String name, String location, int capacity) {
			super();
			this.id = id;
			this.name = name;
			this.location = location;
			this.capacity = capacity;
		}
		public VenueModel() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
