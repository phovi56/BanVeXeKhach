package com.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ve")
public class VeEntity {
	@Id
	@Column(name = "MaVe")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "MaCX")
	private ChuyenXeEntity chuyenXe;
	
	@Column(name = "SoGhe")
	private String soGhe;

	@Column(name = "NgayDat")
	private String ngayDat;
		
	@Column(name = "Email")
	private String email;
	
	@Column(name = "SoDienThoai")
	private String sdt;
	
	@Column(name = "TenKH")
	private String tenKH;
	
	@Column(name = "TrangThai")
	private int trangThai;
	
	@Column(name = "GhiChu")
	private String ghiChu;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ChuyenXeEntity getChuyenXe() {
		return chuyenXe;
	}

	public void setChuyenXe(ChuyenXeEntity chuyenXe) {
		this.chuyenXe = chuyenXe;
	}

	public String getSoGhe() {
		return soGhe;
	}

	public void setSoGhe(String soGhe) {
		this.soGhe = soGhe;
	}

	public String getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(String ngayDat) {
		this.ngayDat = ngayDat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getTenKH() {
		return tenKH;
	}

	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
}
