package com.example.zoostoreproject.Bussiness.operations.item.archive;

import com.example.zoostoreproject.Bussiness.Mappers.Item.ItemMapperImpl;
import com.example.zoostoreproject.Data.Repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemArchiveService {

    @Autowired
    private final ItemRepository itemRepository;
    @Autowired
    private final ItemMapperImpl itemMapper;
}
