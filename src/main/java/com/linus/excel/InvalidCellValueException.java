package com.linus.excel;

public class InvalidCellValueException extends Exception {

	private static final long serialVersionUID = -5017333119562442338L;

	public InvalidCellValueException(int rowIndex, int colIndex, String value) {
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
		this.cellValue = value;
	}	
	
	public int getColIndex() {
		return colIndex;
	}

	public void setColIndex(int colIndex) {
		this.colIndex = colIndex;
	}

	public int getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	public String getCellValue() {
		return cellValue;
	}

	public void setCellValue(String cellValue) {
		this.cellValue = cellValue;
	}

	private int colIndex;
	private int rowIndex;
	private String cellValue;
}
