package com.example.zoostoreproject.core.item.itemsbytitleregex;

import com.example.zoostoreproject.api.Item.bytitleregex.GetByTitleRegexInput;
import com.example.zoostoreproject.api.Item.bytitleregex.GetByTitleRegexOperation;
import com.example.zoostoreproject.api.Item.bytitleregex.GetByTitleRegexResult;
import com.example.zoostoreproject.persistence.entity.Item;
import com.example.zoostoreproject.persistence.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

    // Return a list of item found by title using regex

@Service
@RequiredArgsConstructor
public class GetItemByTitleRegexOperationProcessor implements GetByTitleRegexOperation {

    private final ItemRepository itemRepository;

    @Override
    public List<GetByTitleRegexResult> process(GetByTitleRegexInput operationInput) {
        List<Item> itemList = itemRepository.findByTitleRegex(operationInput.getRegex());
        List<GetByTitleRegexResult> getByTitleRegexResults = new ArrayList<>();

        itemList.forEach(item -> {
            getByTitleRegexResults.add(GetByTitleRegexResult.builder()
                    .id(item.getId())
                    .title(item.getTitle())
                    .vendor(item.getVendorId())
                    .tags(item.getTags())
                    .media(item.getMedia())
                    .description(item.getDescription())
                    .archived(item.getArchived())
                    .build());
        });

        return getByTitleRegexResults;
    }
}
