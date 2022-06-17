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

import com.example.dto.XeDTO;
import com.example.service.IXeService;

@RestController
@RequestMapping("/bus")
public class XeAPI {
	@Autowired
	private IXeService iXeService;
	
	@PostMapping("")
	public XeDTO createXe(@RequestBody XeDTO xeDTO) {
		return iXeService.saveXe(xeDTO);
	}
	
	@PutMapping("/{id}")
	public XeDTO updateXe(@RequestBody XeDTO xeDTO, @PathVariable("id") Long id) {
		xeDTO.setMaXe(id);
		
		return iXeService.saveXe(xeDTO);
	}
	
	@DeleteMapping("")
	public boolean deleteXe(@RequestParam("id") long id) {
		
		return iXeService.deleteXe(id);
	}
	
	@GetMapping("")
	public List<XeDTO> getXe(){
		return iXeService.getAll();
	}
	
//	@GetMapping("/{id}")
//	public List<XeDTO> getList(@PathVariable("id") String id){
//		
//		return iXeService.getXeByMaLT(id);
//	}
}
