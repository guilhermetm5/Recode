package com.recode.backend.entity;

import java.util.Objects;

/*
 *	Autor: João Guilherme em 12/07/2024,
 * 	Para entrega e avaliação da Recode ProAldeia. 
 */

public class Usuario {
	
	private int id;
	private String nome;
	private int idade;
	private String dataNasc;
	private String email;
	private String telefone;
	
	public Usuario() {
		super();
	}

	public Usuario(int id, String nome, int idade, String dataNasc, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.dataNasc = dataNasc;
		this.email = email;
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}
	
	
}


