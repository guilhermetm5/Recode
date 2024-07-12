package com.recode.backend.entity;

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

	
}


