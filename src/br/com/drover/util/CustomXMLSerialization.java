package br.com.drover.util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;

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
        xstream.registerConverter(new DateConverter("dd/MM/yyyy", new String[0]));  
        return xstream;  
    }    

}
