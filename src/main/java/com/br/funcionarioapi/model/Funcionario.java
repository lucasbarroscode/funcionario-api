package com.br.funcionarioapi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Funcionario implements Serializable {
	
	private static final long serialVersionUID = 2806421523585360625L;
	
	@Column(name="id", unique=true)
	private String id;
	
	@Column()
	private String nome;
	
	@Column()
	private String cpf;
	
	@Column()
	private String departamento;
	
	@Column()
	private BigDecimal remuneracao;
	
	@Column()
	private LocalDateTime dataDeContratacao;
	
	
	

	public Funcionario() {
	}

	public Funcionario(String id, String nome, String cpf, String departamento, BigDecimal remuneracao,
			LocalDateTime dataDeContratacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.departamento = departamento;
		this.remuneracao = remuneracao;
		this.dataDeContratacao = dataDeContratacao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public BigDecimal getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(BigDecimal remuneracao) {
		this.remuneracao = remuneracao;
	}

	public LocalDateTime getDataDeContratacao() {
		return dataDeContratacao;
	}

	public void setDataDeContratacao(LocalDateTime dataDeContratacao) {
		this.dataDeContratacao = dataDeContratacao;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", departamento=" + departamento
				+ ", remuneracao=" + remuneracao + ", dataDeContratacao=" + dataDeContratacao + "]";
	}
	
	

	
	
	
}
