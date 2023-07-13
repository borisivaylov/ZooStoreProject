package com.example.zoostoreproject.Data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID Id;

    private String title;

    private String description;

    private  String vendor;

    @OneToMany
    private Set<Tag> tags;

    @OneToMany
    protected Set<Media> media;
}
