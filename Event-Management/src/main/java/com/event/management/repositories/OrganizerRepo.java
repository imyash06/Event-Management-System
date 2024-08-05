package com.event.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.event.management.model.OrganizerModel;

@Repository
public interface OrganizerRepo extends JpaRepository<OrganizerModel, Long> {
}
