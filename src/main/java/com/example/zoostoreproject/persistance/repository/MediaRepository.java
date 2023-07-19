package com.example.zoostoreproject.persistance.repository;


import com.example.zoostoreproject.persistance.entity.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MediaRepository extends JpaRepository<Media, UUID>
{

}
