package com.example.zoostoreproject.Bussiness.operations.item.update;

import com.example.zoostoreproject.Bussiness.mappers.Item.ItemMapperImpl;
import com.example.zoostoreproject.Data.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemUpdateService {
    @Autowired
    private final ItemRepository itemRepository;
    @Autowired
    private final ItemMapperImpl itemMapper;
}
