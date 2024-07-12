package com.recode.backend.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
 *	Autor: João Guilherme em 12/07/2024,
 * 	Para entrega e avaliação da Recode ProAldeia. 
 */

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "usuario_nome", nullable = false, length = 80)
	private String nome;
	@Column(name = "usuario_idade", nullable = false)
	private String idade;
	@Column(name = "usuario_dataNascimento", nullable = false)
	private String dataNasc;
	@Column(name = "usuario_email", nullable = false)
	private String email;
	@Column(name = "usuario_telefone", nullable = false)
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


