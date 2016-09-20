package com.linus.converters;

import java.awt.Color;

import org.springframework.core.convert.converter.Converter;

public class StringToColorConverter implements Converter<String, Color> {

	@Override
	public Color convert(String source) {
		Color c = null;
		try {
			// Decodable string: decimal number, 0x HexDigits, 0X HexDigits, #
			// HexDigits, 0 OctalDigits
			c = Color.decode(source);
		} catch (NumberFormatException e) {
			c = Color.getColor(source);
		}
		
		return c;
	}

}
