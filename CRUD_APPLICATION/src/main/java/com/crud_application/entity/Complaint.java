package com.crud_application.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "complaints")
public class Complaint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String ticketNo;

    @Column(nullable = false, updatable = false)
    private LocalDateTime dateTime;

    @NotBlank(message = "Project Name is required")
    private String projectName;

    @NotBlank(message = "Module Name is required")
    private String moduleName;

    @NotBlank(message = "Sub Module Name is required")
    private String subModuleName;

    @Enumerated(EnumType.STRING)
    private Frequency frequency;

    @Enumerated(EnumType.STRING)
    private Priority priority;

    @NotBlank(message = "Explain Your Issue is required")
    @Column(length = 500)
    private String explainIssue;

    @Enumerated(EnumType.STRING)
    private Status status;
    
    public void setStatus(Status status) {
        this.status = status;
    }
    
    @PrePersist
    protected void onCreate() {
        this.ticketNo = "TICKET-" + UUID.randomUUID().toString().substring(0, 8);
        this.dateTime = LocalDateTime.now();
        this.status = Status.NEW;
    }

    // ✅ Add Getters and Setters Manually (Remove Lombok)
    public Long getId() { return id; }
    public String getTicketNo() { return ticketNo; }
    public LocalDateTime getDateTime() { return dateTime; }
    public String getProjectName() { return projectName; }
    public String getModuleName() { return moduleName; }
    public String getSubModuleName() { return subModuleName; }
    public Frequency getFrequency() { return frequency; }
    public Priority getPriority() { return priority; }
    public String getExplainIssue() { return explainIssue; }
    public Status getStatus() { return status; }

    public void setProjectName(String projectName) { this.projectName = projectName; }
    public void setModuleName(String moduleName) { this.moduleName = moduleName; }
    public void setSubModuleName(String subModuleName) { this.subModuleName = subModuleName; }
    public void setFrequency(Frequency frequency) { this.frequency = frequency; }
    public void setPriority(Priority priority) { this.priority = priority; }
    public void setExplainIssue(String explainIssue) { this.explainIssue = explainIssue; }
}
