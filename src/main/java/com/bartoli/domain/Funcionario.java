package com.bartoli.domain;

import java.io.Serializable;
import java.util.Date;

public class Funcionario implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String cpf;
	private String rg;
	private Date datanasc;
	private Boolean status;
	
}
