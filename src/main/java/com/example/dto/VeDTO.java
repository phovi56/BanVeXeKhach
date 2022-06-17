package com.example.dto;

public class VeDTO {
	private Long maVe;
	private String maCX;
	private String tenKH;
	private String email;
	private String sdt;
	private String ngayDat;
	private String maGhe;
	private int trangThai;	
	private String ghiChu;

	public Long getMaVe() {
		return maVe;
	}
	public void setMaVe(Long maVe) {
		this.maVe = maVe;
	}
	public String getMaGhe() {
		return maGhe;
	}
	public void setMaGhe(String maGhe) {
		this.maGhe = maGhe;
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
	public String getMaCX() {
		return maCX;
	}
	public void setMaCX(String maCX) {
		this.maCX = maCX;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
}
