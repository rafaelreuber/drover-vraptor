package br.com.drover.util;

import com.thoughtworks.xstream.converters.basic.LongConverter;

public class CustomLongConverter extends LongConverter {

	@Override
	public Object fromString(String value) {
		
		if(value == null || value.equals(""))
			return null;
		
		return super.fromString(value);
	}
}
