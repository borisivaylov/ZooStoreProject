package com.example.zoostoreproject.persistance.repository;

import com.example.zoostoreproject.persistance.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TagRepository extends JpaRepository<Tag, UUID>
{

}
