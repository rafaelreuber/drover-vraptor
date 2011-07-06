package br.com.drover.entity;

/**
 * Drover
 *
 * @autor Rafael Reuber (rafaelreuber@gmail.com)
 * @sinse 07/03/2011 
 */
public enum TipoTelefone {
	
	RESIDENCIAL("Residencial"), COMERCIAL("Comercial"), MOVEL("Movel");
	
	String descricao;

	private TipoTelefone(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
