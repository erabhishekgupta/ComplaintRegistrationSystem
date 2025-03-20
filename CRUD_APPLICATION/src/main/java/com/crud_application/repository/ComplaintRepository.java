package com.crud_application.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.crud_application.entity.Complaint;

import java.util.Optional;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
    Optional<Complaint> findByTicketNo(String ticketNo);
}

