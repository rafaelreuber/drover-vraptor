package br.com.drover.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.sun.istack.internal.NotNull;

/**
 * Drover
 *
 * @autor Rafael Reuber (rafaelreuber@gmail.com)
 * @sinse 09/03/2011 
 */
@Entity
public class Cidade {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable=false)
	private String nome;

	private Integer estado_id;
	
	public Cidade() {
		
	}
	
    public Cidade(Integer id) {
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

	public Integer getEstado() {
		return estado_id;
	}

	public void setEstado(Integer estado) {
		this.estado_id = estado;
	}

}
