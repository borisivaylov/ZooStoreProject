package com.example.zoostoreproject.Repository;


import com.example.zoostoreproject.Entity.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MediaRepository extends JpaRepository<Media, UUID>
{

}
