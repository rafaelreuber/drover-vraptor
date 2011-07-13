package br.com.drover.controller;

import java.util.List;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.drover.dao.ClienteDAO;
import br.com.drover.entity.Cidade;
import br.com.drover.entity.Cliente;
import br.com.drover.entity.ClienteWrapper;
import br.com.drover.util.ExtJSJsonImpl;

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
   public void criar(ClienteWrapper cliente)
   {
		   if(cliente.getCliente().getId() == 0){
			   cliente.getCliente().setId(null);
		   }
		   //TODO Arrumar essa esculhambaÃ§Ã£o.
		    cliente.getCliente().setCidade(new Cidade(130));
		    clienteDao.save(cliente.getCliente());
		   
			result.use(ExtJSJsonImpl.class).from(cliente).success().serialize();
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
	
}