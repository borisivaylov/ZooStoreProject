package com.example.zoostoreproject.Data.repository;

import com.example.zoostoreproject.Data.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VendorRepository extends JpaRepository<Vendor, UUID> {
}
