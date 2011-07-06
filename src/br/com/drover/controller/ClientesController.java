package br.com.drover.controller;

import static br.com.caelum.vraptor.view.Results.json;

import java.util.List;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.drover.dao.ClienteDAO;
import br.com.drover.entity.Cidade;
import br.com.drover.entity.Cliente;
import br.com.drover.entity.ClienteWrapper;

@Resource
public class ClientesController {
	
	private ClienteDAO clienteDao;
	
	private Result result;
	
	public ClientesController(ClienteDAO clienteDao,Result result) {
		 this.result = result;
		 this.clienteDao = clienteDao;
	}
	
   public void lista(){
			List<Cliente> clientes = clienteDao.findAll();
		//	result.use(resul. ).from(clientes).success(true).serialize();
			result.use(json()).from(clientes, "data").serialize();
	}

   @Consumes
   public void criar(ClienteWrapper cliente)
   {
		   if(cliente.getCliente().getId() == 0){
			   cliente.getCliente().setId(null);
		   }
		   cliente.getCliente().setCidade(new Cidade(130));
		   clienteDao.save(cliente.getCliente());
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
