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
@Table(name = "ChuyenXe")
public class ChuyenXeEntity {
	@Id
	@Column(name = "MaCX")
	private String id;
	
	@Column(name = "NgayDi")
	private String ngayDi;
	
	@ManyToOne
	@JoinColumn(name = "MaLT")
	private LoTrinhEntity loTrinh;
	
	@ManyToOne
	@JoinColumn(name = "MaXe")
	private XeEntity xe;
	
	@OneToMany(mappedBy = "chuyenXe")
	private List<VeEntity> ve = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNgayDi() {
		return ngayDi;
	}

	public void setNgayDi(String ngayDi) {
		this.ngayDi = ngayDi;
	}

	public LoTrinhEntity getLoTrinh() {
		return loTrinh;
	}

	public void setLoTrinh(LoTrinhEntity loTrinh) {
		this.loTrinh = loTrinh;
	}

	public XeEntity getXe() {
		return xe;
	}

	public void setXe(XeEntity xe) {
		this.xe = xe;
	}

	public List<VeEntity> getVe() {
		return ve;
	}

	public void setVe(List<VeEntity> ve) {
		this.ve = ve;
	}
}
