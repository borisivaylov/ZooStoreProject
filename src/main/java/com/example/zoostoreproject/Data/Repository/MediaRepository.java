package com.example.zoostoreproject.Data.Repository;


import com.example.zoostoreproject.Data.Entity.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MediaRepository extends JpaRepository<Media, UUID>
{

}
