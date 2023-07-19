package com.example.zoostoreproject.persistance.repository;

import com.example.zoostoreproject.persistance.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VendorRepository extends JpaRepository<Vendor, UUID> {
}
