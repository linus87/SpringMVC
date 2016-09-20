package com.linus.excel;

import java.beans.PropertyDescriptor;

public class ColumnConfiguration {
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isWritable() {
		return writable;
	}
	public void setWritable(boolean writable) {
		this.writable = writable;
	}
	public PropertyDescriptor getPropertyDescriptor() {
		return propertyDescriptor;
	}
	public void setPropertyDescriptor(PropertyDescriptor propertyDescriptor) {
		this.propertyDescriptor = propertyDescriptor;
	}

	public int getReadOrder() {
		return readOrder;
	}
	public void setReadOrder(int readOrder) {
		this.readOrder = readOrder;
	}
	public int getWriteOrder() {
		return writeOrder;
	}
	public void setWriteOrder(int writeOrder) {
		this.writeOrder = writeOrder;
	}

	private String title;
	private int readOrder;
	private int writeOrder;
	private boolean writable;
	private PropertyDescriptor propertyDescriptor;
}
