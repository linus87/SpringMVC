package com.linus.propertyeditors;

import java.awt.Color;
import java.beans.PropertyEditorSupport;

public class ColorEditor extends PropertyEditorSupport {
	public void setAsText(String text) {
		try {
			//Decodable string: decimal number, 0x HexDigits, 0X HexDigits, # HexDigits, 0 OctalDigits 
			Color c = Color.decode(text);
			setValue(c);
		} catch(NumberFormatException e)  {
			setValue(Color.getColor(text));
		}
		
	}
	
	@Override
	public String getAsText() {
		StringBuffer result = new StringBuffer("#");
		Color c = (Color)this.getValue();
		result.append(Integer.toHexString(c.getRed()));
		result.append(Integer.toHexString(c.getGreen()));
		result.append(Integer.toHexString(c.getBlue()));
		
		return result.toString();
	}
}
