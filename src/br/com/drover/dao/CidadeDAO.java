package br.com.drover.dao;

import java.util.List;

import br.com.drover.entity.Cidade;
import br.com.drover.entity.Estado;

/**
 * Drover
 *
 * @autor Rafael Reuber (rafaelreuber@gmail.com)
 * @sinse 09/03/2011 
 */
public interface CidadeDAO extends GenericDAO<Cidade, Integer> {

   /**
    * Método usado para filtrar cidades de acordo com o Estado
    *	
    * @param estado 
    * @return Lista de Cidades de um determinado estado
    */
   List<Cidade>	listByEstado(Estado estado); 

}
