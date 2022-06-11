package com.example.dto;

import java.time.LocalDate;

public class VeDTO {
	private String maVe;
	private String maGhe;
	private LocalDate ngayDat;
	private String email;
	private String sdt;
	private int trangThai;
	private String ghiChu;
	private String maCX;
	
	public String getMaVe() {
		return maVe;
	}
	public void setMaVe(String maVe) {
		this.maVe = maVe;
	}
	public String getMaGhe() {
		return maGhe;
	}
	public void setMaGhe(String maGhe) {
		this.maGhe = maGhe;
	}
	public LocalDate getNgayDat() {
		return ngayDat;
	}
	public void setNgayDat(String ngayDat) {
		this.ngayDat = LocalDate.parse(ngayDat);
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
}
