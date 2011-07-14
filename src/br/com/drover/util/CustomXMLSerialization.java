package br.com.drover.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
import com.thoughtworks.xstream.converters.basic.IntConverter;

import br.com.caelum.vraptor.converter.IntegerConverter;
import br.com.caelum.vraptor.deserialization.XStreamXMLDeserializer;
import br.com.caelum.vraptor.http.ParameterNameProvider;
import br.com.caelum.vraptor.ioc.Component;

@Component    
public class CustomXMLSerialization extends XStreamXMLDeserializer{

	public CustomXMLSerialization(ParameterNameProvider provider) {
		super(provider);
	}
	
	@Override    
    public XStream getXStream() {    
        XStream xstream = super.getXStream();    
        xstream.registerConverter(new CustomDateConverter("dd/MM/yyyy"));  
        xstream.registerConverter(new CustomLongConverter());
        xstream.registerConverter(new CustomIntegerConverter());
        return xstream;  
    }    

}
