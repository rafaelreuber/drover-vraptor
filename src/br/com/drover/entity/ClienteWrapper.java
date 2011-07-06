package br.com.drover.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("clienteWrapper")
public class ClienteWrapper {
	
	 private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	 

}
