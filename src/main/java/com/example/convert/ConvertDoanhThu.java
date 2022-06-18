package com.example.convert;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

import com.example.dto.DoanhThu;

@Component
public class ConvertDoanhThu {
	public DoanhThu toDTO(Object[] obj) {
		DoanhThu doanhThu = new DoanhThu();
		doanhThu.setMaXe((BigInteger) obj[0]);
		doanhThu.setTongTien((Double) obj[1]);
		return doanhThu;
	}
}
