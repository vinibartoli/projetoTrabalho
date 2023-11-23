package com.bartoli.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Setor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private Boolean status;
	@OneToMany
	private List<Funcionario> funcionario;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public List<Funcionario> getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Setor(Integer id, String descricao, Boolean status, List<Funcionario> funcionario) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.status = status;
		this.funcionario = funcionario;
	}
	public Setor() {
		super();
	}
	
	
}
