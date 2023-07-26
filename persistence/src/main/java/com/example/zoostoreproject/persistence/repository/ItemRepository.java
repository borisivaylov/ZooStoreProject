package com.example.zoostoreproject.persistence.repository;


import com.example.zoostoreproject.persistence.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemRepository extends JpaRepository<Item, UUID>
{
    Item findItemById(UUID uuid);
}
