package com.event.management.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.management.model.EventModel;

@Repository
public interface EventRepo extends JpaRepository<EventModel, Long> {
    List<EventModel> findByVenue_Id(Long venueId);
    List<EventModel> findByOrganizer_Id(Long organizerId);
}
