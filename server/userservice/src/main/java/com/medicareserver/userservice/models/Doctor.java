package com.medicareserver.userservice.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "doctors")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class Doctor {
    @Id
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    @Column(nullable = false)
    private String specialization;

    @Column(nullable = false, unique = true, name = "license_number")
    private String licenseNumber;

    private float salary;
}
