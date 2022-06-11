package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.convert.ConvertChuyenXe;
import com.example.dto.ChuyenXeDTO;
import com.example.entity.ChuyenXeEntity;
import com.example.entity.XeEntity;
import com.example.repository.ChuyenXeRepo;
import com.example.repository.XeRepo;
import com.example.service.IChuyenXeService;

@Service
public class ChuyenXeService implements IChuyenXeService {
	@Autowired
	ChuyenXeRepo cXeRepo;
	@Autowired
	XeRepo xeRepo;
	@Autowired
	ConvertChuyenXe convertChuyenXe;
	
	@Override
	public ChuyenXeDTO saveChuyenXe(ChuyenXeDTO dto) {
		// TODO Auto-generated method stub
		ChuyenXeEntity entity = new ChuyenXeEntity();
		ChuyenXeEntity oldEntity = cXeRepo.findOne(dto.getMaCX());
		if(oldEntity != null) {
			entity = convertChuyenXe.toEntity(dto, oldEntity);
		}
		else {
			entity = convertChuyenXe.toEntity(dto);			
		}
		XeEntity xeEntity = xeRepo.findOne(dto.getMaXe());
		entity.setXe(xeEntity);
		entity = cXeRepo.save(entity);
		
		return convertChuyenXe.toDTO(entity);
	}
	
//	@Override
//	public ChuyenXeDTO updateChuyenXe(String maCX) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public boolean deleteChuyenXe(String maCX) {
		// TODO Auto-generated method stub
		ChuyenXeEntity entity = cXeRepo.findOne(maCX);
		if(entity != null) {
			cXeRepo.delete(entity);
			return true;
		}
		return false;
	}

	@Override
	public List<ChuyenXeDTO> getAll() {
		// TODO Auto-generated method stub
		List<ChuyenXeDTO> listDTO = new ArrayList<ChuyenXeDTO>();
		List<ChuyenXeEntity> listEntity = cXeRepo.findAll();
		
		for(ChuyenXeEntity entity: listEntity)
		{
			listDTO.add(convertChuyenXe.toDTO(entity));
		}
		return listDTO;
	}

	@Override
	public ChuyenXeDTO getOneByCode(String maCX) {
		// TODO Auto-generated method stub
		
		return convertChuyenXe.toDTO(cXeRepo.findOne(maCX));
	}

}
