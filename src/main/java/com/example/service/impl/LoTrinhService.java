package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.convert.ConvertLoTrinh;
import com.example.dto.LoTrinhDTO;
import com.example.entity.LoTrinhEntity;
import com.example.repository.LoTrinhRepo;
import com.example.service.ILoTrinhService;

@Service
public class LoTrinhService implements ILoTrinhService {
	@Autowired
	LoTrinhRepo repo;
	@Autowired
	ConvertLoTrinh convert;
	
	@Override
	public LoTrinhDTO save(LoTrinhDTO dto) {
		LoTrinhEntity entity = new LoTrinhEntity();
		LoTrinhEntity oldEntity = repo.findOne(dto.getMa()); 
		if(oldEntity != null) {
			entity = convert.toEntity(dto, oldEntity);
		}
		else {
			entity = convert.toEntity(dto);
		}
		entity = repo.save(entity);
		
		return convert.toDTO(entity);
	}
	
	@Override
	public boolean delete(String maLT) {
		LoTrinhEntity entity = repo.getOne(maLT);
		if(entity != null) {
			repo.delete(entity);
			return true;
		}
		return false;
	}
	
	@Override
	public List<LoTrinhDTO> getAll() {
		List<LoTrinhDTO> listDTO = new ArrayList<LoTrinhDTO>();
		List<LoTrinhEntity> listEntity = repo.findAll();
		
		for(LoTrinhEntity entity: listEntity)
		{
			listDTO.add(convert.toDTO(entity));
		}
		return listDTO;
	}
}
