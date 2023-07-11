package com.example.zoostoreproject.Entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.*;
import org.aspectj.weaver.AnnotationNameValuePair;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor (access = AccessLevel.PUBLIC)
@Entity
@Table(name = "items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    protected UUID Id;
    @Column
    protected String title;
    @Column
    protected String description;
    @Column
    protected  String vendor;
   // @Column
   // protected List<Tag> tags;
    //protected Set<media> media;

}
