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

import com.example.dto.VeDTO;
import com.example.service.IVeService;

@RestController
@RequestMapping("/ticket")
public class VeAPI {
	@Autowired
	IVeService service;
	
	@PostMapping("")
	public VeDTO createVe(@RequestBody VeDTO dto) {
		return service.saveVe(dto);
	}
	
	@PutMapping("")
	public VeDTO updateVe(@RequestBody VeDTO dto) {
		return service.saveVe(dto);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteVe(@PathVariable("id") Long id) {
		return service.deleteVe(id);
	}
	
	@GetMapping("")
	public List<VeDTO> getListVe() {
		return service.getAll();
	}
}
