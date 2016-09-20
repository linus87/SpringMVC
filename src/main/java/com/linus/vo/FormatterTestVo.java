package com.linus.vo;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class FormatterTestVo {
	@DateTimeFormat(iso=ISO.DATE)
	private Date date; // yyyy-MM-dd
	
	private Currency currency;
	
	@NumberFormat(style=Style.CURRENCY)
	private BigDecimal decimal; 

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public BigDecimal getDecimal() {
		return decimal;
	}

	public void setDecimal(BigDecimal decimal) {
		this.decimal = decimal;
	}

}
