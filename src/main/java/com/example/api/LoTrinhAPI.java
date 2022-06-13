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
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.LoTrinhDTO;
import com.example.service.ILoTrinhService;

@RestController
@RequestMapping("/route")
public class LoTrinhAPI {
	@Autowired
	ILoTrinhService service;
	
	@PostMapping("")
	public LoTrinhDTO createLoTrinh(@RequestBody LoTrinhDTO dto) {
		
		return service.save(dto); 
	}
	
	@PutMapping("")
	public LoTrinhDTO updateLoTrinh(@RequestBody LoTrinhDTO dto) {
		return service.save(dto);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteLoTrinh(@PathVariable("id") String id) {
		return service.delete(id);
	}
	
	@GetMapping("")
	public List<LoTrinhDTO> getLoTrinhs(){
		return service.getAll();
	}
}
