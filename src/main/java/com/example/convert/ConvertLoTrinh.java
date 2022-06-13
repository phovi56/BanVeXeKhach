package com.example.convert;

import org.springframework.stereotype.Component;

import com.example.dto.LoTrinhDTO;
import com.example.entity.LoTrinhEntity;

@Component
public class ConvertLoTrinh {
	public LoTrinhDTO toDTO(LoTrinhEntity entity) {
		LoTrinhDTO dto = new LoTrinhDTO();
		dto.setMa(entity.getMa());
		dto.setNoiDi(entity.getNoiDi());
		dto.setNoiDen(entity.getNoiDen());
		dto.setKhoangCach(entity.getKhoangCach());
		
		return dto;
	}
	
	public LoTrinhEntity toEntity(LoTrinhDTO dto) {
		LoTrinhEntity entity = new LoTrinhEntity();
		entity.setMa(dto.getMa());
		entity.setNoiDi(dto.getNoiDi());
		entity.setNoiDen(dto.getNoiDen());
		entity.setKhoangCach(dto.getKhoangCach());
		
		return entity;
	}
	
	public LoTrinhEntity toEntity(LoTrinhDTO dto, LoTrinhEntity entity) {
		entity.setNoiDi(dto.getNoiDi());
		entity.setNoiDen(dto.getNoiDen());
		entity.setKhoangCach(dto.getKhoangCach());
		
		return entity;
	}
}
