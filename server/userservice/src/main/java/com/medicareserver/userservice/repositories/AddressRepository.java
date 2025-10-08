package com.medicareserver.userservice.repositories;

import com.medicareserver.userservice.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {}
