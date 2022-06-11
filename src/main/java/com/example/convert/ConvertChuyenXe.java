package com.example.convert;

import org.springframework.stereotype.Component;

import com.example.dto.ChuyenXeDTO;
import com.example.entity.ChuyenXeEntity;

@Component
public class ConvertChuyenXe {
	public ChuyenXeDTO toDTO(ChuyenXeEntity entity) {
		ChuyenXeDTO dto = new ChuyenXeDTO();
		if(entity.getId() != null)
			dto.setMaCX(entity.getId());			
		dto.setTenchuyen(entity.getTen());
		dto.setNoiDi(entity.getNoiDi());
		dto.setNoiDen(entity.getNoiDen());
		dto.setNgayDi(entity.getNgayDi());
		dto.setKhoangcach(entity.getKhoangCach());
		dto.setMaXe(entity.getXe().getId());
		
		return dto;
	}
	
	public ChuyenXeEntity toEntity(ChuyenXeDTO dto) {
		ChuyenXeEntity entity = new ChuyenXeEntity();
		entity.setId(dto.getMaCX());
		entity.setTen(dto.getTenchuyen());
		entity.setNoiDi(dto.getNoiDi());
		entity.setNoiDen(dto.getNoiDen());
		entity.setNgayDi(dto.getNgayDi());
		entity.setKhoangCach(dto.getKhoangcach());
		
		return entity;
	}
	
	public ChuyenXeEntity toEntity(ChuyenXeDTO dto, ChuyenXeEntity entity) {
		entity.setId(dto.getMaCX());
		entity.setTen(dto.getTenchuyen());
		entity.setNoiDi(dto.getNoiDi());
		entity.setNoiDen(dto.getNoiDen());
		entity.setNgayDi(dto.getNgayDi());
		entity.setKhoangCach(dto.getKhoangcach());
		
		return entity;
	}
}
