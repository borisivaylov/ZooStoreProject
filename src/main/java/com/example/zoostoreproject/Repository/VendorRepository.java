package com.example.zoostoreproject.Repository;

import com.example.zoostoreproject.Entity.Tag;
import com.example.zoostoreproject.Entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VendorRepository extends JpaRepository<Vendor, UUID> {
}
