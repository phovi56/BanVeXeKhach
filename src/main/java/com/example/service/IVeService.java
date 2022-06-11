package com.example.service;

import java.util.List;

import com.example.dto.VeDTO;

public interface IVeService {
	public VeDTO saveVe(VeDTO dto);
	public boolean deleteVe(String maVe);
	public List<VeDTO> getAll();
}
