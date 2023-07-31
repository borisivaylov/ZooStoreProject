package com.example.zoostoreproject.core.item.getallitems;

import com.example.zoostoreproject.api.Item.getallitems.GetAllItemsOperation;
import com.example.zoostoreproject.api.Item.getallitems.GetAllItemsRequest;
import com.example.zoostoreproject.api.Item.getallitems.GetAllItemsResponse;
import com.example.zoostoreproject.persistence.entity.Item;
import com.example.zoostoreproject.persistence.entity.Tag;
import com.example.zoostoreproject.persistence.repository.ItemRepository;
import com.example.zoostoreproject.persistence.repository.TagRepository;
import com.example.zoostoreproject.persistence.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllItemsOperationProcessor implements GetAllItemsOperation {

    private final ItemRepository itemRepository;
    private final VendorRepository vendorRepository;
    private final TagRepository tagRepository;


    @Override
    public List<GetAllItemsResponse> process(GetAllItemsRequest getAllItemsRequest) {

        List<GetAllItemsResponse> getAllItemsResponseList = new ArrayList<GetAllItemsResponse>();
        Tag tag = tagRepository.findTagByTagName(getAllItemsRequest.getTagName());

        List<Item> getAllItemsList = itemRepository.findAllByTags(tag);


        for (Item item : getAllItemsList) {

            String vendorName = vendorRepository.findVendorById(item.getVendorId()).getVendorName();

            GetAllItemsResponse getAllItemsResponse = GetAllItemsResponse.builder()
                    .id(item.getId())
                    .title(item.getTitle())
                    .description(item.getDescription())
                    .vendor(vendorName)
                    .media(item.getMedia())
                    .tags(item.getTags())
                    .archived(item.getArchived())
                    .build();

                getAllItemsResponseList.add(GetAllItemsResponse.builder()
                        .id(item.getId())
                        .title(item.getTitle())
                        .description(item.getDescription())
                        .vendor(vendorName)
                        .media(item.getMedia())
                        .tags(item.getTags())
                        .archived(item.getArchived())
                        .build());

                System.out.println("pause");
        }
        return getAllItemsResponseList;
    }
}

