package com.bartoli.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Empresa implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;	
	private String razaosocial;
	private String cnpj;
	private String uf;
	private String cidade;
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String telefone;
	private String email;
	private Boolean status = Boolean.TRUE;

}



