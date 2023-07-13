package com.example.zoostoreproject.Data.repository;

import com.example.zoostoreproject.Data.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemRepository extends JpaRepository<Item, UUID>
{
    
}
