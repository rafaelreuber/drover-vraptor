package br.com.drover.util;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import br.com.caelum.vraptor.interceptor.TypeNameExtractor;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.serialization.ProxyInitializer;
import br.com.caelum.vraptor.serialization.xstream.XStreamJSONSerialization;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.converters.SingleValueConverter;
      
    @Component    
    public class CustomJSONSerialization extends XStreamJSONSerialization {    
              
        public CustomJSONSerialization(HttpServletResponse response,TypeNameExtractor extractor, ProxyInitializer initializer) {    
            super(response, extractor, initializer);    
        }    
               

       @Override    
        public XStream getXStream() {    
            XStream xstream = super.getXStream();    
            
            xstream.registerConverter(new   SingleValueConverter() {    
        
               public String toString(Object value)
               {
            	     throw new RuntimeException();
                     //return new  SimpleDateFormat("dd/MM/yyyy").format(value);    
               }    
        
               public boolean canConvert(Class clazz) {    
                    return Date.class.isAssignableFrom(clazz);    
               }    
        
               public Object fromString(String value) {    
                  return null; //não é usado    
               }    
            });     
            return xstream;    
        }    
          
    }     