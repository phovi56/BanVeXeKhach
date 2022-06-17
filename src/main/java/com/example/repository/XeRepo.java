package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.XeEntity;

@Repository
public interface XeRepo extends JpaRepository<XeEntity, Long>{
}
