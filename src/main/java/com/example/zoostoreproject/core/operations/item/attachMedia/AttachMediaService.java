package com.example.zoostoreproject.core.operations.item.attachMedia;

import com.example.zoostoreproject.API.Operations.Item.attachMedia.AttachMediaRequest;
import com.example.zoostoreproject.API.Operations.Item.attachMedia.AttachMediaResponse;
import com.example.zoostoreproject.API.Operations.base.OperationInput;
import com.example.zoostoreproject.API.Operations.base.OperationProcessor;
import com.example.zoostoreproject.API.Operations.base.OperationResult;
import com.example.zoostoreproject.persistance.entity.Item;
import com.example.zoostoreproject.persistance.entity.Media;
import com.example.zoostoreproject.persistance.repository.ItemRepository;
import com.example.zoostoreproject.persistance.repository.MediaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttachMediaService implements com.example.zoostoreproject.API.Operations.Item.attachMedia.AttachMediaService {
    private final ItemRepository itemRepository;

    private final MediaRepository mediaRepository;

    @Override
    public AttachMediaResponse process(AttachMediaRequest attachMediaRequest) {
        Item item = itemRepository.findById(attachMediaRequest.getItemId()).orElseThrow(()->
                new IllegalArgumentException("Item with ID:" + attachMediaRequest.getItemId() + "was not found"));
        Media media = mediaRepository.findById(attachMediaRequest.getMediaId()).orElseThrow(() ->
                new IllegalArgumentException("Tag with ID:" + attachMediaRequest.getMediaId() + "was not found"));

        item.getMedia().add(media);
        itemRepository.save(item);

        return AttachMediaResponse.builder()
                .itemId(item.getId())
                .mediaId(item.getMedia())
                .build();
    }
}
