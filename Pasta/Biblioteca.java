package Biblioteca;

import java.util.ArrayList;

public class Biblioteca extends Livros{
	public ArrayList<Livros> bibli = new ArrayList<Livros>();
	
	private String nome;
	private String localizacao;
	private int capacidade;
	private String prateleiraDeGeneros; // Provavelmente vou ter que alterar para ArrayList
	
	// Métodos Especiais
	// Constructor
	public Biblioteca(String codigo,String titulo,String autor, String iSBN, int quantidade, String genero, int numero_de_paginas, int edicao, String nome, String localizacao, int capacidade, String prateleiraDeGeneros) {
		super(codigo, titulo, autor, iSBN, quantidade, genero, numero_de_paginas, edicao);
		this.setNome(nome);
		this.setLocalizacao(localizacao);
		this.setCapacidade(capacidade);
		this.setPrateleiraDeGeneros(prateleiraDeGeneros);
	}
	
	public Biblioteca() {
		
	}

	//Setters and Getters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getPrateleiraDeGeneros() {
		return prateleiraDeGeneros;
	}

	public void setPrateleiraDeGeneros(String prateleiraDeGeneros) {
		this.prateleiraDeGeneros = prateleiraDeGeneros;
	}
}
