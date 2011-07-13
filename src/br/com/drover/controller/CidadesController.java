package br.com.drover.controller;

import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.drover.dao.CidadeDAO;
import br.com.drover.entity.Cidade;
import br.com.drover.util.ExtJSJsonImpl;

@Resource
public class CidadesController {
	
	private Result result;
	
	private CidadeDAO cidadeDao;
	
	public CidadesController(Result result, CidadeDAO cidadeDao) {
		this.result = result;
		this.cidadeDao = cidadeDao;
	}
	
	@Path("/cidades") @Get
	public void lista()
	{
		List<Cidade> cidades = cidadeDao.findAll();
		result.use(ExtJSJsonImpl.class).from(cidades).success().serialize();
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public CidadeDAO getCidadeDao() {
		return cidadeDao;
	}

	public void setCidadeDao(CidadeDAO cidadeDao) {
		this.cidadeDao = cidadeDao;
	}
	

}
