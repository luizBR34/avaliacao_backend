package com.trusthub.avaliacao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "Dados")
@Table(name = "dados")
public class Dados implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
	@Column(name = "codigo")
	private long codigo;
	
	@NotNull
	@Column(name = "nome")
	private String nome;
	
	@NotNull
	@Column(name = "limite")
	private float limite;
	
	@NotNull
	@Column(name = "taxaJuros")
	private float taxaJuros;
	
	@NotNull
	@Column(name = "risco")
	private char risco[];
	
	

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public float getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(float taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public char[] getRisco() {
		return risco;
	}

	public void setRisco(char[] risco) {
		this.risco = risco;
	}

}
