package br.com.drover.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * Drover
 *
 * @autor Rafael Reuber (rafaelreuber@gmail.com)
 * @sinse 12/03/2011 
 */
@Entity
public class Produto {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
