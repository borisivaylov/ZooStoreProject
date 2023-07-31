package com.example.zoostoreproject.persistence.repository;


import com.example.zoostoreproject.persistence.entity.Item;
import com.example.zoostoreproject.persistence.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Repository
public interface ItemRepository extends JpaRepository<Item, UUID>, PagingAndSortingRepository<Item,UUID>
{
    Item findItemById(UUID uuid);
    List<Item> findAllByTags(Tag tag);
}
