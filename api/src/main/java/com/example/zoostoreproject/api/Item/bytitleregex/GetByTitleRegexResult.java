package com.example.zoostoreproject.api.Item.bytitleregex;

import com.example.zoostoreproject.api.base.OperationResult;
import com.example.zoostoreproject.persistence.entity.Media;
import com.example.zoostoreproject.persistence.entity.Tag;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetByTitleRegexResult implements OperationResult {
    @JsonProperty("id")
    private UUID id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("vendor")
    private UUID vendor;
    @JsonProperty("media")
    private Set<Media> media;
    @JsonProperty("tags")
    private Set<Tag> tags;
    @JsonProperty("archived")
    private boolean archived;
}
