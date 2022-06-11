package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "chuyenxe")
public class ChuyenXeEntity {
	@Id
	@Column(name = "MaCX")
	private String id;
	
	@Column(name = "TenChuyen")
	private String ten;
	
	@Column(name = "NoiDi")
	private String noiDi;
	
	@Column(name = "NoiDen")
	private String noiDen;
	
	@Column(name = "NgayDi")
	private String ngayDi;
	
	@ManyToOne
	@JoinColumn(name = "MaXe")
	private XeEntity xe;
	
	@Column(name = "KhoangCach")
	private int khoangCach;
	
	@OneToMany(mappedBy = "chuyenXe")
	private List<VeEntity> ve = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getNgayDi() {
		return ngayDi;
	}

	public void setNgayDi(String ngayDi) {
		this.ngayDi = ngayDi;
	}

	public XeEntity getXe() {
		return xe;
	}

	public void setXe(XeEntity xe) {
		this.xe = xe;
	}

	public int getKhoangCach() {
		return khoangCach;
	}

	public void setKhoangCach(int khoangCach) {
		this.khoangCach = khoangCach;
	}

	public List<VeEntity> getVe() {
		return ve;
	}

	public void setVe(List<VeEntity> ve) {
		this.ve = ve;
	}
}
