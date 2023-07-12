package com.example.zoostoreproject.Data.Repository;

import com.example.zoostoreproject.Data.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ItemRepository extends JpaRepository<Item, UUID>
{
    
}
