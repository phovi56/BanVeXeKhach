package com.example.service;

import java.util.List;

import com.example.dto.ChuyenXeDTO;
import com.example.dto.DoanhThu;

public interface IChuyenXeService {
	public ChuyenXeDTO saveChuyenXe(ChuyenXeDTO dto);
//	public ChuyenXeDTO updateChuyenXe(String maCX, ChuyenXeDTO dto);
	public boolean deleteChuyenXe(String maCX);
	public List<ChuyenXeDTO> getAll();
	public ChuyenXeDTO getOneByCode(String maCX);
	public List<DoanhThu> getDoanhThu(String ngayBD, String ngayKT);
}
