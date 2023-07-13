package com.example.zoostoreproject.Data.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "media")
public class Media {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.UUID)
    protected UUID Id;

    protected String url;


    protected UUID itemId;

}
