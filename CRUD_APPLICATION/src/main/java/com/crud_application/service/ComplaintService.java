package com.crud_application.service;




import org.springframework.stereotype.Service;

import com.crud_application.entity.Complaint;
import com.crud_application.entity.Status;
import com.crud_application.exception.ComplaintNotFoundException;
import com.crud_application.repository.ComplaintRepository;

import java.util.List;

@Service
public class ComplaintService {

    private final ComplaintRepository complaintRepository;

    public ComplaintService(ComplaintRepository complaintRepository) {
        this.complaintRepository = complaintRepository;
    }

    public Complaint addComplaint(Complaint complaint) {
        return complaintRepository.save(complaint);
    }

    public List<Complaint> getAllComplaints() {
        return complaintRepository.findAll();
    }

    public Complaint getComplaintById(Long id) {
        return complaintRepository.findById(id)
                .orElseThrow(() -> new ComplaintNotFoundException("Complaint not found with ID: " + id));
    }

    public Complaint getComplaintByTicketNo(String ticketNo) {
        return complaintRepository.findByTicketNo(ticketNo)
                .orElseThrow(() -> new ComplaintNotFoundException("Complaint not found with Ticket No: " + ticketNo));
    }

    public Complaint closeComplaint(Long id) {
        Complaint complaint = getComplaintById(id);
        complaint.setStatus(Status.CLOSED);
        return complaintRepository.save(complaint);
    }
}

