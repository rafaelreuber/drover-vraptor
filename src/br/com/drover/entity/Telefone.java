package br.com.drover.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Drover
 *
 * @autor Rafael Reuber (rafaelreuber@gmail.com)
 * @sinse 07/03/2011 
 */
@Entity
public class Telefone {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String numero;
	
	private TipoTelefone tipoTelefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}
	
}
