package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.ChuyenXeDTO;
import com.example.service.IChuyenXeService;

@RestController
@RequestMapping("/route")
public class ChuyenXeAPI {
	@Autowired
	private IChuyenXeService service;
	
	@PostMapping("")
	public ChuyenXeDTO createChuyenXe(@RequestBody ChuyenXeDTO dto) {
		return service.saveChuyenXe(dto);
	}
	
	@PutMapping("")
	public ChuyenXeDTO updateChuyenXe(@RequestParam("id") String id, @RequestBody ChuyenXeDTO dto) {
		dto.setMaCX(id);
		
		return service.saveChuyenXe(dto);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteChuyenXe(@PathVariable("id") String id) {
		return service.deleteChuyenXe(id);
	}
	
	@GetMapping("")
	public List<ChuyenXeDTO> getChuyenXeDTOs(){
		return service.getAll();
	}
}
