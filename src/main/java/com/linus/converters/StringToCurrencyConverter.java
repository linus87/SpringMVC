package com.linus.converters;

import java.util.Currency;

import org.springframework.core.convert.converter.Converter;

/**
 * Create Currency through country code.
 * @author linus.yan
 *
 */
public class StringToCurrencyConverter implements Converter<String, Currency> {
	@Override
	public Currency convert(String currencyCode) {
		return Currency.getInstance(currencyCode);
	}
}
