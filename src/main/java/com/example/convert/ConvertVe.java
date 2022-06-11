package com.example.convert;

import org.springframework.stereotype.Component;

import com.example.dto.VeDTO;
import com.example.entity.VeEntity;

@Component
public class ConvertVe {
	public VeDTO toDTO(VeEntity entity) {
		VeDTO dto = new VeDTO();
		dto.setMaVe(entity.getId());
		dto.setMaGhe(entity.getSoGhe());
		dto.setNgayDat(entity.getNgayDat().toString());
		dto.setEmail(entity.getEmail());
		dto.setSdt(entity.getSdt());
		dto.setTrangThai(entity.getTrangThai());
		dto.setGhiChu(entity.getGhiChu());
		
		return dto;
	}
	
	public VeEntity toEntity(VeDTO dto) {
		VeEntity entity = new VeEntity();
		entity.setId(dto.getMaVe());
		entity.setSoGhe(dto.getMaGhe());
		entity.setNgayDat(dto.getNgayDat().toString());
		entity.setEmail(dto.getEmail());
		entity.setSdt(dto.getSdt());
		entity.setTrangThai(dto.getTrangThai());
		entity.setGhiChu(dto.getGhiChu());
		
		return entity;
	}
	
	public VeEntity toEntity(VeDTO dto, VeEntity entity) {// chỉnh đổi thông tin
		entity.setSoGhe(dto.getMaGhe());
		entity.setEmail(dto.getEmail());
		entity.setSdt(dto.getSdt());
		entity.setGhiChu(dto.getGhiChu());
		
		return entity;
	}
}
