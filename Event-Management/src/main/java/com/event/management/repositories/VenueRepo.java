package com.event.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.event.management.model.VenueModel;

@Repository
public interface VenueRepo extends JpaRepository<VenueModel, Long> {
}
