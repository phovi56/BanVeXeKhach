package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.DoanhThu;
import com.example.service.IChuyenXeService;

@RestController
public class OtherAPI {
	@Autowired
	private IChuyenXeService service;
	
	@GetMapping("/turnovers")
	public List<DoanhThu> getDoanhThu(@RequestParam("ngayBD") String ngayBD, @RequestParam("ngayKT") String ngayKT){
		return service.getDoanhThu(ngayBD, ngayKT);
	}
}
