package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.VeEntity;

@Repository
public interface VeRepo extends JpaRepository<VeEntity, String>{

}
