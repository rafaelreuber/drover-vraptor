package br.com.drover.test;

import org.junit.Test;

import br.com.drover.entity.Cliente;
import br.com.drover.entity.ClienteWrapper;

import com.thoughtworks.xstream.XStream;

public class XmlTest {

	@Test
	public void test() {
		
	 String xmlString =	"<br.com.drover.entity.ClienteWrapper>"+
			"<cliente>" +
			"<id>0</id>"+
			"<nome>Antonio</nome>"+
			"<cpfCnpj>12312312</cpfCnpj>"+
			"<rg>0</rg>"+
			"<numero>0</numero>"+
			"<orgaoExpedidor></orgaoExpedidor>"+
			"<dataExpedicao>2004-02-22 15:16:04.0 EST</dataExpedicao>"+
			"<cidade></cidade>"+
			"<logradouro>Rua A</logradouro>"+
			"<bairro>Monte Castelo</bairro>"+
			"<dataNascimento>22/02/2004 15:16:04.0 EST</dataNascimento>"+
			"<limiteCredito>0</limiteCredito>"+
			"</cliente>"+
			"</br.com.drover.entity.ClienteWrapper>";
		
		XStream stream = new XStream();
	//	stream.processAnnotations(ClienteWrapper.class);
		
		 ClienteWrapper  obj = (ClienteWrapper) stream.fromXML(xmlString);
		 Cliente cliente = obj.getCliente();
		 System.out.println(cliente);
		 
	}

}
