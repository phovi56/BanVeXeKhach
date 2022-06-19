package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.ChuyenXeEntity;
import com.example.entity.LoTrinhEntity;

@Repository
public interface ChuyenXeRepo extends JpaRepository<ChuyenXeEntity, String> {
	List<ChuyenXeEntity> findChuyenXeByloTrinh(LoTrinhEntity loTrinhEntity);
	
	@Query(value = "SELECT xe.ma_xe, SUM(xe.gia_tien*(SELECT COUNT(ve.ma_ve) FROM ve WHERE ve.macx = cx.macx)) AS tong_tien "
			+ "FROM xe "
			+ "JOIN chuyen_xe cx "
			+ "ON xe.ma_xe = cx.ma_xe "
			+ "WHERE STR_TO_DATE(cx.ngay_di,'%d/%m/%Y') BETWEEN STR_TO_DATE(?1,'%d/%m/%Y') AND STR_TO_DATE(?2,'%d/%m/%Y') "
			+ "GROUP BY xe.ma_xe "
			+ "ORDER BY xe.ma_xe;", nativeQuery = true)
	List<Object[]> getDoanhThuByXe(String ngayBD, String ngayKT);
}
