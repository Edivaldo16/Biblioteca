package Biblioteca;

import java.util.ArrayList;

public class Livros {
	
	private String codigo; // O que seria esse código??? FUC + [NÚMERO DE CADASTRO] 
	private String titulo;
	private String autor;
	private String ISBN;
	private int quantidade;
	private String genero;
	private int numero_de_paginas;
	private int edicao;
	//private String listaDeLivros; // Provavelmente vou ter que alterar para ArrayList
	
	// Métodos Especiais
	// Constructor
	public Livros(String codigo, String titulo, String autor, String iSBN, int quantidade, String genero,
			int numero_de_paginas, int edicao) {
		super();
		this.setCodigo(codigo);
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setISBN(iSBN);
		this.setQuantidade(quantidade);
		this.setGenero(genero);
		this.setNumero_de_paginas(numero_de_paginas);
		this.setEdicao(edicao);
		//this.setListaDeLivros(listaDeLivros); // Provavelmente vou ter que alterar para ArrayList
	}
	
	public Livros(String codigo, String titulo) {
		super();
		this.setCodigo(codigo);
		this.setTitulo(titulo);
	}

	public Livros() {

	}
	
	//Getters and Setters
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumero_de_paginas() {
		return numero_de_paginas;
	}

	public void setNumero_de_paginas(int numero_de_paginas) {
		this.numero_de_paginas = numero_de_paginas;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
}
