package com.example.zoostoreproject.core.item.attachMedia;


import com.example.zoostoreproject.api.Item.attachMedia.AttachMediaOperation;
import com.example.zoostoreproject.api.Item.attachMedia.AttachMediaRequest;
import com.example.zoostoreproject.api.Item.attachMedia.AttachMediaResponse;
import com.example.zoostoreproject.persistence.entity.Item;
import com.example.zoostoreproject.persistence.entity.Media;
import com.example.zoostoreproject.persistence.repository.ItemRepository;
import com.example.zoostoreproject.persistence.repository.MediaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttachMediaOperationProcessor implements AttachMediaOperation {

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
                .media(item.getMedia())
                .build();
    }
}
