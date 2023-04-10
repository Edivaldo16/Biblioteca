package Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca extends Livros{
	public ArrayList<Livros> bibli = new ArrayList<Livros>();
	public ArrayList<Biblioteca> B = new ArrayList<Biblioteca>();
	
	
	private String nome;
	private String localizacao;
	private int capacidade;
	private String prateleiraDeGeneros; // Provavelmente vou ter que alterar para ArrayList
	
	// Métodos Personalizados:
	/*
	public String toString() {
		return "\nCódigo: " + this.getCodigo() + "\nTítulo: " + this.getTitulo() + "\nAutor: "
				+ this.getAutor() + "\nISBN: " + this.getISBN() + "\nQuantidade: "
				+ this.getQuantidade() + "\nGênero: " + this.getGenero() + "\nPáginas: " + this.getNumero_de_paginas() 
				+"\nEdição: " + this.getEdicao() + "\n";
	}*/
	
	public void cadastrarBiblioteca() {
		Scanner input = new Scanner(System.in);
		Biblioteca L = new Biblioteca();
		System.out.println("Cadastro Biblioteca");
		System.out.println("Nome: ");
		L.setNome(input.next());
		System.out.println("Localização: ");
		L.setLocalizacao(input.next());
		System.out.println("Capacidade: ");
		L.setCapacidade(input.nextInt());
		
		B.add(L);
		System.out.println("Biblioteca cadastrada com sucesso!!!");
		System.out.println();	
	}
	
	public void listarGenero() {
		// FOREACH (PRA CADA)
		for (Livros a : bibli) {
			if (bibli.size() > 0) {
				System.out.println(a.getGenero());
			} else {
				System.out.println("ERRO: A BIBLIOTECA NÃO POSSUI LIVROS");
			}
		}
		System.out.println();
	}
	
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
