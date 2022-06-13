package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LoTrinh")
public class LoTrinhEntity {
	@Id
	@Column(name = "MaLT")
	private String ma;
	
	@Column(name = "TenLT")
	private String ten;
	
	@Column(name = "NoiDi")
	private String noiDi;
	
	@Column(name = "NoiDen")
	private String noiDen;
	
	@Column(name = "KhoangCach")
	private int khoangCach;

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}	

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNoiDi() {
		return noiDi;
	}

	public void setNoiDi(String noiDi) {
		this.noiDi = noiDi;
	}

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getKhoangCach() {
		return khoangCach;
	}

	public void setKhoangCach(int khoangCach) {
		this.khoangCach = khoangCach;
	}	
}
