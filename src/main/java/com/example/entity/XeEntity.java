package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "xe", uniqueConstraints = @UniqueConstraint(columnNames = {"BienSo"}))
public class XeEntity {
	@Id
	@Column(name = "MaXe")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "BienSo")
	private String bienSo;
	
	@Column(name = "LoaiXe")
	private String loaiXe;
	
	@Column(name = "SoLuongGhe")
	private Integer soLuongGhe;
	
	@OneToMany(mappedBy = "xe")
	private List<ChuyenXeEntity> chuyenXe = new ArrayList<>();
	
	public Long getId() {
		return id;
	}

	public String getBienSo() {
		return bienSo;
	}

	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}

	public String getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getSoLuongGhe() {
		return soLuongGhe;
	}

	public void setSoLuongGhe(Integer soLuongGhe) {
		this.soLuongGhe = soLuongGhe;
	}

	public List<ChuyenXeEntity> getChuyenXe() {
		return chuyenXe;
	}

	public void setChuyenXe(List<ChuyenXeEntity> chuyenXe) {
		this.chuyenXe = chuyenXe;
	}
}

