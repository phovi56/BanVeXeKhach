package com.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.convert.ConvertXe;
import com.example.dto.XeDTO;
import com.example.entity.ChuyenXeEntity;
import com.example.entity.XeEntity;
import com.example.repository.ChuyenXeRepo;
import com.example.repository.LoTrinhRepo;
import com.example.repository.XeRepo;
import com.example.service.IXeService;

@Service
public class XeService implements IXeService {
	@Autowired
	private XeRepo xeRepo;
	@Autowired
	private ChuyenXeRepo cXeRepo;
	@Autowired
	private LoTrinhRepo ltRepo;
	@Autowired
	private ConvertXe convertXe;
	

	@Override
	public XeDTO saveXe(XeDTO xe) {
		// TODO Auto-generated method stub
		XeEntity entity = new XeEntity();
		if(xe.getMaXe() != null) {
			XeEntity oldEntity = xeRepo.findOne(xe.getMaXe());
			entity = convertXe.toEntity(xe, oldEntity);
		}
		else {
			entity = convertXe.toEntity(xe);
		}
		entity = xeRepo.save(entity);
		return convertXe.toDTO(entity);
	}
	
	@Override
	public boolean deleteXe(long id) {
		// TODO Auto-generated method stub
		XeEntity xe1 = xeRepo.getOne(id);
		if (xe1 != null) {
			xeRepo.delete(xe1);
			return true;
		}
		return false;
	}

	@Override
	public List<XeDTO> getAll() {
		// TODO Auto-generated method stub
		List<XeDTO> listDTO = new ArrayList<XeDTO>();
		List<XeEntity> listEntity = xeRepo.findAll();
		
		for(XeEntity entity: listEntity)
		{
			listDTO.add(convertXe.toDTO(entity));
		}
		return listDTO;
	}
	
	@Override
	public List<XeDTO> getXeByMaLT(String maLT) {
		List<XeDTO> listDTO = new ArrayList<XeDTO>();
		List<XeEntity> listEntity = xeRepo.findAll();
		ChuyenXeEntity cXeEntity = cXeRepo.findChuyenXeByloTrinh(ltRepo.findOne(maLT));
		
		for (XeEntity xeEntity : listEntity) {
			for (ChuyenXeEntity cXeEntity2 : xeEntity.getChuyenXe()) {
				if(cXeEntity2.equals(cXeEntity)) {
					listDTO.add(convertXe.toDTO(xeEntity));
					break;
				}
			}
		}
		
		return listDTO;
	}
}
