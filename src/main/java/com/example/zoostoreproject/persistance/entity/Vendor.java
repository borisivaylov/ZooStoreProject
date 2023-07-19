package com.example.zoostoreproject.persistance.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vendors")
public class Vendor {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected UUID Id;
    protected String vendorName;
}
