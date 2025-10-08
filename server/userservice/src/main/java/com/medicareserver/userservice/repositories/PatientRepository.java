package com.medicareserver.userservice.repositories;

import com.medicareserver.userservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<User, Long> {}