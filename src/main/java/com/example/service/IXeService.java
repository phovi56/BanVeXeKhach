package com.example.service;

import java.util.List;

import com.example.dto.XeDTO;

public interface IXeService {
	// hàm thêm xe
	public XeDTO saveXe(XeDTO xe);
	
	// hàm chỉnh sửa
//	public XeDTO updatXe(XeDTO Xe);
	
	// hàm xóa
	public boolean deleteXe(long id);
	
	// hàm lấy ds
	public List<XeDTO> getAll();
	
	public List<XeDTO> getXeByMaLT(String maLT);
	
	// hàm lấy 1
//	public XeDTO getOne(String bienSo);
}
