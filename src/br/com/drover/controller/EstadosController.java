package br.com.drover.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.drover.dao.EstadoDAO;
import br.com.drover.entity.Estado;
import br.com.drover.util.ExtJSJsonImpl;

@Resource
public class EstadosController {
	
	private EstadoDAO estadoDao;
	
	private Result result;
	
	public EstadosController(EstadoDAO estadoDao, Result result) {
		this.estadoDao = estadoDao;
		this.result = result;
	}
	
	@Path("/estados") @Get
	public void lista(){
		List<Estado> estados = estadoDao.findAll();
		result.use(ExtJSJsonImpl.class).from(estados).success().serialize();
	}

	public EstadoDAO getEstadoDao() {
		return estadoDao;
	}

	public void setEstadoDao(EstadoDAO estadoDao) {
		this.estadoDao = estadoDao;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
	
}
