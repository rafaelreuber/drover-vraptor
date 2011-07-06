package br.com.drover.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.internal.NotNull;

/**
 * Drover
 *
 * @autor Rafael Reuber (rafaelreuber@gmail.com)
 * @sinse 08/03/2011 
 */
@Entity
public class Estado {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(length=3)
	private String  sigla;
	
	@Column(length=40)
	@NotNull
	private String nome;
	
	public Estado() {
		
	}
	
	public Estado(Integer id) {
		this.id = id;
	}
	
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

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

}
