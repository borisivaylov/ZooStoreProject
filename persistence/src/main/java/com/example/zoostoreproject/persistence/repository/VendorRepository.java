package com.example.zoostoreproject.persistence.repository;



import com.example.zoostoreproject.persistence.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VendorRepository extends JpaRepository<Vendor, UUID> {
    Vendor findVendorById(UUID uuid);
}
