package com.event.management.controller;



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


import com.event.management.model.OrganizerModel;

import com.event.management.services.OrganizerService;

@RestController
@RequestMapping("/organizers")
public class OrganizerContro {

    @Autowired
    private OrganizerService organizerService;

    @PostMapping
    public OrganizerModel createOrganizer(@RequestBody OrganizerModel organizer) {
        return organizerService.createOrganizer(organizer);
    }

    @GetMapping("/getOrganizer/{id}")
    public ResponseEntity<OrganizerModel> getOrganizerById(@PathVariable Long id) {
        return organizerService.getOrganizerById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/updateOrganizer/{id}")
    public ResponseEntity<OrganizerModel> updateOrganizer(@PathVariable Long id, @RequestBody OrganizerModel organizerDetails) {
        return ResponseEntity.ok(organizerService.updateOrganizer(id, organizerDetails));
    }

    @DeleteMapping("/deleteOrganizer/{id}")
    public ResponseEntity<Void> deleteOrganizer(@PathVariable Long id) {
        organizerService.deleteOrganizer(id);
        return ResponseEntity.noContent().build();
    }
}
