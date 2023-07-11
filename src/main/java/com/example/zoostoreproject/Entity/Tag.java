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
@Table(name = "tags")
public class Tag {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    protected UUID Id;
    @Column
    protected String tagName;

}
