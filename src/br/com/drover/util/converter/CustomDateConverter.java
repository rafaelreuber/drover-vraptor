package br.com.drover.util.converter;

import com.thoughtworks.xstream.converters.basic.DateConverter;

public class CustomDateConverter extends DateConverter {
	
	public CustomDateConverter(String format) {
	   super(format, new String[0]);
	}
	
    @Override
	public Object fromString(String value) 
    {	
		if(value == null ||  value.equals("")){
			return null;
		}
		return super.fromString(value);
	}

}
