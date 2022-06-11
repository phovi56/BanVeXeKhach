package com.example.convert;

import org.springframework.stereotype.Component;

import com.example.dto.XeDTO;
import com.example.entity.XeEntity;

@Component
public class ConvertXe {
	public XeDTO toDTO(XeEntity xeEntity) {
		XeDTO xeDTO = new XeDTO();
		if(xeEntity.getId() != null)
			xeDTO.setMaXe(xeEntity.getId());			
		xeDTO.setBienSo(xeEntity.getBienSo());
		xeDTO.setLoaiXe(xeEntity.getLoaiXe());
		xeDTO.setSoLuongGhe(xeEntity.getSoLuongGhe());
		
		return xeDTO;
	}
	
	public XeEntity toEntity(XeDTO xeDTO) {
		XeEntity xeEntity = new XeEntity();
		xeEntity.setBienSo(xeDTO.getBienSo());
		xeEntity.setLoaiXe(xeDTO.getLoaiXe());
		xeEntity.setSoLuongGhe(xeDTO.getSoLuongGhe());
		
		return xeEntity;
	}
	
	public XeEntity toEntity(XeDTO xeDTO, XeEntity xeEntity) {
		xeEntity.setBienSo(xeDTO.getBienSo());
		xeEntity.setLoaiXe(xeDTO.getLoaiXe());
		xeEntity.setSoLuongGhe(xeDTO.getSoLuongGhe());
		
		return xeEntity;
	}
}
