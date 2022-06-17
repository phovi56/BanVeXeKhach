package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.ChuyenXeEntity;
import com.example.entity.LoTrinhEntity;

@Repository
public interface ChuyenXeRepo extends JpaRepository<ChuyenXeEntity, String> {
	List<ChuyenXeEntity> findChuyenXeByloTrinh(LoTrinhEntity loTrinhEntity);
}
