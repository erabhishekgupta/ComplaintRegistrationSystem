package com.crud_application.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.crud_application.entity.Complaint;
import com.crud_application.service.ComplaintService;

import java.util.List;

@RestController
@RequestMapping("/complaints")
public class ComplaintController {

    private final ComplaintService complaintService;

    public ComplaintController(ComplaintService complaintService) {
        this.complaintService = complaintService;
    }

    @PostMapping
    public ResponseEntity<Complaint> registerComplaint(@Valid @RequestBody Complaint complaint) {
        Complaint savedComplaint = complaintService.addComplaint(complaint);
        return ResponseEntity.ok(savedComplaint);
    }

    @GetMapping
    public ResponseEntity<List<Complaint>> getAllComplaints() {
        return ResponseEntity.ok(complaintService.getAllComplaints());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Complaint> getComplaintById(@PathVariable Long id) {
        return ResponseEntity.ok(complaintService.getComplaintById(id));
    }

    @GetMapping("/ticket/{ticketNo}")
    public ResponseEntity<Complaint> getComplaintByTicketNo(@PathVariable String ticketNo) {
        return ResponseEntity.ok(complaintService.getComplaintByTicketNo(ticketNo));
    }

    @PutMapping("/close/{id}")
    public ResponseEntity<Complaint> closeComplaint(@PathVariable Long id) {
        return ResponseEntity.ok(complaintService.closeComplaint(id));
    }
}
