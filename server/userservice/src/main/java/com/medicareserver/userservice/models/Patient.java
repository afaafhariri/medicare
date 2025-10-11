package com.medicareserver.userservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "patients")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Patient {
    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    @Column(nullable = false, name = "emergency_contact_name")
    private String emergencyContactName;

    @Column(nullable = false, name = "emergency_contact_number")
    private String emergencyContactNumber;

    @Column(nullable = false)
    private String profession;
}
