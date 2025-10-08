package com.medicareserver.userservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "patients")
@Getter
@Setter
public class Patient {
    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    private String emergencyContactName;

    @Column(nullable = false)
    private String emergencyContactNumber;

    @Column(nullable = false)
    private String profession;
}
