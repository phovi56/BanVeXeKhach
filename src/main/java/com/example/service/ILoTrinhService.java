package com.example.service;

import java.util.List;

import com.example.dto.LoTrinhDTO;

public interface ILoTrinhService {
	public LoTrinhDTO save(LoTrinhDTO dto);
	public boolean delete(String maLT);
	public List<LoTrinhDTO> getAll();
}
