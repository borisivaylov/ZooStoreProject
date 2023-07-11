package com.example.zoostoreproject.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;
@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor (access = AccessLevel.PUBLIC)
@Entity
@Table(name = "media")
public class Media {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    protected UUID Id;
    @Column
    protected String url;

    @Column
    protected UUID itemId;

}
