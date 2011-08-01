package br.com.drover.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jettison.json.JSONArray;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.drover.dao.ClienteDAO;
import br.com.drover.entity.Cliente;
import br.com.drover.util.ExtJSJsonImpl;
import br.com.drover.util.ExtJSReturn;
import static br.com.caelum.vraptor.view.Results.json;

@Resource
public class ClientesController {
	
	private ClienteDAO clienteDao;
	
	private Result result;
	
	public ClientesController(ClienteDAO clienteDao,Result result) {
		 this.result = result;
		 this.clienteDao = clienteDao;
	}
	
   public void lista() 
   {
			List<Cliente> clientes = clienteDao.findAll();
			result.use(ExtJSJsonImpl.class).from(clientes).success().serialize();
   }

   @Consumes
   public void criar(Cliente cliente)
   {
	   try {
		   
	   //TODO Entende por que o ExtJS não está entendendo a entidade Cliente.
	    clienteDao.save(cliente);	   
		result.use(ExtJSJsonImpl.class).from(cliente).success().serialize();
		
	    } catch (Exception e) {
	    	mapError("Deu erro oh.");
	    }	
    }

	public ClienteDAO getClienteDao() {
		return clienteDao;
	}


	public void setClienteDao(ClienteDAO clienteDao) {
		this.clienteDao = clienteDao;
	}
	
	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	
	public void mapError(String msg){

		ExtJSReturn hs = new ExtJSReturn();
		hs.setMessage(msg);
		hs.setSucess(false);

		result.use(ExtJSJsonImpl.class).from("Deu Erro").success(false).serialize();
	} 
	
}