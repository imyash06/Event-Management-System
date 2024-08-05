package com.event.management.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.management.model.OrganizerModel;
import com.event.management.repositories.OrganizerRepo;

@Service
public class OrganizerService {

	@Autowired
	private OrganizerRepo organizerRepository;

    public OrganizerModel createOrganizer(OrganizerModel organizer) {
        return organizerRepository.save(organizer);
    }

    public Optional<OrganizerModel> getOrganizerById(Long id) {
        return organizerRepository.findById(id);
    }

    public OrganizerModel updateOrganizer(Long id, OrganizerModel organizerDetails) {
        OrganizerModel organizer = organizerRepository.findById(id).orElseThrow();
        organizer.setName(organizerDetails.getName());
        organizer.setContactInfo(organizerDetails.getContactInfo());
        return organizerRepository.save(organizer);
    }

	public void deleteOrganizer(Long id) {
		// TODO Auto-generated method stub
		
	}
}
