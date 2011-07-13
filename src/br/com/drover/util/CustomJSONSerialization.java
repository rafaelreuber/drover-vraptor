package br.com.drover.util;


import javax.servlet.http.HttpServletResponse;

import br.com.caelum.vraptor.interceptor.TypeNameExtractor;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.serialization.ProxyInitializer;
import br.com.caelum.vraptor.serialization.xstream.XStreamJSONSerialization;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.basic.DateConverter;
      
    @Component    
    public class CustomJSONSerialization extends XStreamJSONSerialization {    
              
        public CustomJSONSerialization(HttpServletResponse response,TypeNameExtractor extractor, ProxyInitializer initializer) {    
            super(response, extractor, initializer);    
        }    
               

       @Override    
        public XStream getXStream() {    
            XStream xstream = super.getXStream();    
            xstream.registerConverter(new DateConverter("dd/MM/yyyy", new String[0]));
            xstream.aliasSystemAttribute(null, "class");  
            return xstream;  
        }    
          
    }     