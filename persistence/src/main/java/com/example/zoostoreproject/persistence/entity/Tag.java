package com.example.zoostoreproject.persistence.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tags")
public class Tag {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected UUID Id;
    protected String tagName;

}
