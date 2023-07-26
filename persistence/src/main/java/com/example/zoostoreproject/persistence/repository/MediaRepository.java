package com.example.zoostoreproject.persistence.repository;



import com.example.zoostoreproject.persistence.entity.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MediaRepository extends JpaRepository<Media, UUID>
{
    Media findMediaById(UUID uuid);
}
