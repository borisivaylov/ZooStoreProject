package com.example.zoostoreproject.Data.Repository;

import com.example.zoostoreproject.Data.Entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VendorRepository extends JpaRepository<Vendor, UUID> {
}
