package com.example.zoostoreproject.Entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.*;
import org.aspectj.weaver.AnnotationNameValuePair;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor (access = AccessLevel.PROTECTED)
@Table(name = "items")
public class Item {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column
    protected Long Id;
    @Column
    protected String title;
    @Column
    protected String description;
    @Column
    protected  String vendor;
    @Column
    protected  Set<Tag> tags;
    //protected Set<media> media;

}
