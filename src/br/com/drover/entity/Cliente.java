package br.com.drover.entity;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@SequenceGenerator(name="CLIENTE_S",initialValue=1,sequenceName="CLIENTE_S")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLIENTE_S")
	private Integer id;
	
	private String nome;
	
	private Boolean isPessoaJuridica;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	private Long cpfCnpj;
	
	private Long rg;

	@Temporal(TemporalType.DATE)
	private Date dataExpedicao ;

	private String orgaoExpedidor;
	
	private Double limiteCredito;
	
	private String logradouro;
	
	private Integer numero;
	
	private String bairro;
	
	private String CEP;
	
	private String nomePai;
	
	private String nomeMae;
	
	@ManyToOne
	private Cidade cidade;
	
	public Cliente() {
		
	}
	
	public Cliente(Integer  id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(Long cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	@Autowired
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}

	public void setOrgaoExpedidor(String orgacaoExpedidor) {
		this.orgaoExpedidor = orgacaoExpedidor;
	}

	public Boolean getIsPessoaJuridica() {
		return isPessoaJuridica;
	}

	public void setIsPessoaJuridica(Boolean isPessoaJuridica) {
		this.isPessoaJuridica = isPessoaJuridica;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getCEP() {
		return CEP;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Integer getNumero() {
		return numero;
	}
	
	public Date getDataExpedicao() {
		return dataExpedicao;
	}

	public void setDataExpedicao(Date dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
