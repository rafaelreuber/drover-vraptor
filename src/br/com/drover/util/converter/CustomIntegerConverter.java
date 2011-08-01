package br.com.drover.util.converter;

import com.thoughtworks.xstream.converters.basic.IntConverter;

public class CustomIntegerConverter extends IntConverter {

	@Override
	public Object fromString(String str) {
		if(str == null || str.equals("")){
			return null;
		}
		
		return  super.fromString(str);
	}

}
