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
		dto.setNoiDi(entity.getLoTrinh().getNoiDi());
		dto.setNoiDen(entity.getLoTrinh().getNoiDen());
		dto.setNgayDi(entity.getNgayDi());
		dto.setKhoangcach(entity.getLoTrinh().getKhoangCach());
		dto.setMaXe(entity.getXe().getId());
		
		return dto;
	}
	
	public ChuyenXeEntity toEntity(ChuyenXeDTO dto) {
		ChuyenXeEntity entity = new ChuyenXeEntity();
		entity.setId(dto.getMaCX());
		entity.setNgayDi(dto.getNgayDi());
		
		return entity;
	}
	
	public ChuyenXeEntity toEntity(ChuyenXeDTO dto, ChuyenXeEntity entity) {
		entity.setNgayDi(dto.getNgayDi());
		
		return entity;
	}
}
