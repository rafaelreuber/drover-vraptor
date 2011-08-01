package br.com.drover.util;

import com.thoughtworks.xstream.XStream;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.deserialization.JsonDeserializer;
import br.com.caelum.vraptor.http.ParameterNameProvider;
import br.com.caelum.vraptor.interceptor.TypeNameExtractor;
import br.com.drover.util.converter.CustomDateConverter;
import br.com.drover.util.converter.CustomIntegerConverter;
import br.com.drover.util.converter.CustomLongConverter;

@Resource
public class CustomJSONDeserializer extends JsonDeserializer {

	public CustomJSONDeserializer(ParameterNameProvider provider, TypeNameExtractor extractor) {
		super(provider, extractor);
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
