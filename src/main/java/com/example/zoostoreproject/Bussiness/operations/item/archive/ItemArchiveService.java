package com.example.zoostoreproject.Bussiness.operations.item.archive;

import com.example.zoostoreproject.Bussiness.mappers.Item.ItemMapperImpl;
import com.example.zoostoreproject.Data.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemArchiveService {


    private final ItemRepository itemRepository;

    private final ItemMapperImpl itemMapper;
}
