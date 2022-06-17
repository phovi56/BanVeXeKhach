package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.convert.ConvertVe;
import com.example.dto.VeDTO;
import com.example.entity.ChuyenXeEntity;
import com.example.entity.VeEntity;
import com.example.entity.XeEntity;
import com.example.repository.ChuyenXeRepo;
import com.example.repository.VeRepo;
import com.example.service.IVeService;

@Service
public class VeService implements IVeService{
	@Autowired
	VeRepo veRepo;
	@Autowired
	ChuyenXeRepo cXeRepo;
	@Autowired
	ConvertVe convertVe;
	
	@Override
	public VeDTO saveVe(VeDTO dto) {
		// TODO Auto-generated method stub
		VeEntity entity = new VeEntity();
		if(dto.getMaVe() != null) {
			VeEntity oldEntity = veRepo.findOne(dto.getMaVe());
			entity = convertVe.toEntity(dto, oldEntity);
		}
		else {
			entity = convertVe.toEntity(dto);
		}
		ChuyenXeEntity chuyenXeEntity = cXeRepo.findOne(dto.getMaCX());
		entity.setChuyenXe(chuyenXeEntity);
		entity = veRepo.save(entity);
		
		return convertVe.toDTO(entity);
	}
	
	@Override
	public boolean deleteVe(Long maVe) {
		// TODO Auto-generated method stub
		VeEntity entity = veRepo.findOne(maVe);
		if(entity != null) {
			entity.setTrangThai(-1);
			veRepo.save(entity);
			return true;
		}
		return false;
	}
	
	@Override
	public List<VeDTO> getAll() {
		// TODO Auto-generated method stub
		List<VeDTO> listDTO = new ArrayList<VeDTO>();
		List<VeEntity> listeEntities = veRepo.findAll();
		for (VeEntity veEntity : listeEntities) {
			listDTO.add(convertVe.toDTO(veEntity));
		}
		
		return listDTO;
	}
}
