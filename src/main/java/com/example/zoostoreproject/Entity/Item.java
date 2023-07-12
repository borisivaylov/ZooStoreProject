package com.example.zoostoreproject.Entity;

import jakarta.persistence.*;
import lombok.*;
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
    @Column
    private UUID Id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private  String vendor;
   // @Column
   // protected List<Tag> tags;
    //protected Set<media> media;

}
