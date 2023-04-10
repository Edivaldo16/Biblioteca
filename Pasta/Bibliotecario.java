package Biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Bibliotecario extends Pessoa {
	int x;
	//private ArrayList<Livros> bibli = new ArrayList<Livros>();

	public void addManualLivros() {
		// Gênero Romance
		Livros r01 = new Livros("R01", "Orgulho e Preconceito", "Jane Austen", "978-8535902777", 50, "Romance", 416, 1);
		// Gênero Ficção
		Livros f01 = new Livros("F01", "1984", "George Orwell", "978-8535900940", 50, "Ficção", 416, 1);
		// Gênero Terror
		Livros t01 = new Livros("T01", "It: A Coisa", "Stephen King", "978-8532525687", 50, "Terror", 1104, 1);
		// Gênero Teologia
		Livros te01 = new Livros("TEO01", "Teologia Sistemática", "Wayne Grudem", "978-8527501339", 50, "Teologia", 1296,
				1);
		
		bibli.add(te01);
		bibli.add(r01);
		bibli.add(f01);
		bibli.add(t01);
	}

	// Métodos Personalizados

	// Cadastrar livros
	public void cadastrarLivros() {
		Scanner input = new Scanner(System.in);
		Livros L = new Livros();
		System.out.println("Cadastro Livro");
		System.out.println("Código: ");
		L.setCodigo(input.nextLine());
		System.out.println("Título: ");
		L.setTitulo(input.next());
		System.out.println("Autor/a: ");
		L.setAutor(input.next());
		System.out.println("ISBN: ");
		L.setISBN(input.next());
		System.out.println("Quantidade: ");
		L.setQuantidade(input.nextInt());
		System.out.println("Gênero: ");
		L.setGenero(input.next());
		System.out.println("Páginas: ");
		L.setNumero_de_paginas(input.nextInt());
		System.out.println("Edição: ");
		L.setEdicao(input.nextInt());

		bibli.add(L);
		System.out.println("Livro adicionado a biblioteca com sucesso!!!");
		menuLivrosBibliotecario();
	}

	// Ataulizar/Corrigir informações cadastrais do livro
	public void atualizarLivroISBN(String iSBN) throws ParseException {
		Livros atual = new Livros();
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código para atualizar: ");
		iSBN = sc.next();

		for (int i = 0; i < bibli.size(); i++) {

			if (bibli.get(i).getISBN().equals(iSBN)) {

				System.out.println("Código: ");
				atual.setCodigo(input.nextLine());
				System.out.println("Título: ");
				atual.setTitulo(input.next());
				System.out.println("Autor/a: ");
				atual.setAutor(input.next());
				System.out.println("ISBN: ");
				atual.setISBN(input.next());
				System.out.println("Quantidade: ");
				atual.setQuantidade(input.nextInt());
				System.out.println("Gênero: ");
				atual.setGenero(input.next());
				System.out.println("Páginas: ");
				atual.setNumero_de_paginas(input.nextInt());
				System.out.println("Edição: ");
				atual.setEdicao(input.nextInt());
				bibli.set(i, atual);
				System.out.println("Cadastro Atualizado!!!");
			} else {
				System.out.println("Código/Livro Inexistente!!!");
			}
		}
		menuLivrosBibliotecario();
	}
	
	public void atualizarLivroTitulo(String titulo) throws ParseException {
		Livros atual = new Livros();
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código para atualizar: ");
		titulo = sc.next();

		for (int i = 0; i < bibli.size(); i++) {

			if (bibli.get(i).getISBN().equals(titulo)) {

				System.out.println("Código: ");
				atual.setCodigo(input.nextLine());
				System.out.println("Título: ");
				atual.setTitulo(input.next());
				System.out.println("Autor/a: ");
				atual.setAutor(input.next());
				System.out.println("ISBN: ");
				atual.setISBN(input.next());
				System.out.println("Quantidade: ");
				atual.setQuantidade(input.nextInt());
				System.out.println("Gênero: ");
				atual.setGenero(input.next());
				System.out.println("Páginas: ");
				atual.setNumero_de_paginas(input.nextInt());
				System.out.println("Edição: ");
				atual.setEdicao(input.nextInt());
				bibli.set(i, atual);
				System.out.println("Cadastro Atualizado!!!");
			} else {
				System.out.println("Código/Livro Inexistente!!!");
			}
		}
		menuLivrosBibliotecario();
	}

	// Mostra os gêneros dos livros
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
		menuLivrosBibliotecario();
	}

	// Mostra os gêneros e cada livro atrelado ao gênero
	public void listarLivroPorGenero() {
		//Livros atual = new Livros();

		for (int i = 0; i < bibli.size(); i++) {

			if (bibli.get(i).getGenero().equals("Romance")) {
				System.out.println("Livros do Gênero Romance");
				System.out.println("Código: " + bibli.get(i).getCodigo());
				System.out.println("Título: " + bibli.get(i).getTitulo());
				System.out.println("Autor/a: " + bibli.get(i).getAutor());
				System.out.println("ISBN: " + bibli.get(i).getISBN());
				System.out.println("Quantidade: " + bibli.get(i).getQuantidade());
				System.out.println("Gênero: " + bibli.get(i).getGenero());
				System.out.println("Páginas: " + bibli.get(i).getNumero_de_paginas());
				System.out.println("Edição: " + bibli.get(i).getEdicao());
				System.out.println();
			} else if (bibli.get(i).getGenero().equals("Terror")) {
				System.out.println("Livros do Gênero Terror");
				System.out.println("Código: " + bibli.get(i).getCodigo());
				System.out.println("Título: " + bibli.get(i).getTitulo());
				System.out.println("Autor/a: " + bibli.get(i).getAutor());
				System.out.println("ISBN: " + bibli.get(i).getISBN());
				System.out.println("Quantidade: " + bibli.get(i).getQuantidade());
				System.out.println("Gênero: " + bibli.get(i).getGenero());
				System.out.println("Páginas: " + bibli.get(i).getNumero_de_paginas());
				System.out.println("Edição: " + bibli.get(i).getEdicao());
				System.out.println();
			}else if (bibli.get(i).getGenero().equals("Ficção")) {
				System.out.println("Livros do Gênero Ficção");
				System.out.println("Código: " + bibli.get(i).getCodigo());
				System.out.println("Título: " + bibli.get(i).getTitulo());
				System.out.println("Autor/a: " + bibli.get(i).getAutor());
				System.out.println("ISBN: " + bibli.get(i).getISBN());
				System.out.println("Quantidade: " + bibli.get(i).getQuantidade());
				System.out.println("Gênero: " + bibli.get(i).getGenero());
				System.out.println("Páginas: " + bibli.get(i).getNumero_de_paginas());
				System.out.println("Edição: " + bibli.get(i).getEdicao());
				System.out.println();
			}else if (bibli.get(i).getGenero().equals("Teologia")) {
				System.out.println("Código: " + bibli.get(i).getCodigo());
				System.out.println("Título: " + bibli.get(i).getTitulo());
				System.out.println("Autor/a: " + bibli.get(i).getAutor());
				System.out.println("ISBN: " + bibli.get(i).getISBN());
				System.out.println("Quantidade: " + bibli.get(i).getQuantidade());
				System.out.println("Gênero: " + bibli.get(i).getGenero());
				System.out.println("Páginas: " + bibli.get(i).getNumero_de_paginas());
				System.out.println("Edição: " + bibli.get(i).getEdicao());
				System.out.println();
			}
			else {
				System.out.println("Código/Livro Inexistente!!!");
			}
		}
		//menuBibliotecario();
		menuLivrosBibliotecario();
	}
	
	// Pesquisar Livros p/ ISBN
	public Livros pesquisarLivroISBN(String iSBN) {
		Scanner input = new Scanner(System.in);
		System.out.println("Busca Livro");
		System.out.println("ISBN: ");
		iSBN = input.next();

		for (int i = 0; i < bibli.size(); i++) {

			if (bibli.get(i).getISBN().equals(iSBN)) {
				System.out.println("Código: " + bibli.get(i).getCodigo());
				System.out.println("Título: " + bibli.get(i).getTitulo());
				System.out.println("Autor/a: " + bibli.get(i).getAutor());
				System.out.println("ISBN: " + bibli.get(i).getISBN());
				System.out.println("Quantidade: " + bibli.get(i).getQuantidade());
				System.out.println("Gênero: " + bibli.get(i).getGenero());
				System.out.println("Páginas: " + bibli.get(i).getNumero_de_paginas());
				System.out.println("Edição: " + bibli.get(i).getEdicao());
				System.out.println();
				return bibli.get(i);
			}
		}
		System.out.println("Cadastro não localizado!");
		return null;
	}
	
	    // Pesquisar Livros p/ Título
		public Livros pesquisarLivroTitulo(String titulo) {
			Scanner input = new Scanner(System.in);
			System.out.println("Busca Livro");
			System.out.println("Título: ");
			titulo = input.next();

			for (int i = 0; i < bibli.size(); i++) {

				if (bibli.get(i).getTitulo().equals(titulo)) {
					System.out.println("Código: " + bibli.get(i).getCodigo());
					System.out.println("Título: " + bibli.get(i).getTitulo());
					System.out.println("Autor/a: " + bibli.get(i).getAutor());
					System.out.println("ISBN: " + bibli.get(i).getISBN());
					System.out.println("Quantidade: " + bibli.get(i).getQuantidade());
					System.out.println("Gênero: " + bibli.get(i).getGenero());
					System.out.println("Páginas: " + bibli.get(i).getNumero_de_paginas());
					System.out.println("Edição: " + bibli.get(i).getEdicao());
					System.out.println();
					return bibli.get(i);
				}
			}
			System.out.println("Cadastro não localizado!");
			return null;
		}
		
		// Remover Livros p/ autor
		public void removerLivroAutor(String autor) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o nome do autor: ");
			autor = sc.next();

			for (int i = 0; i < bibli.size(); i++) {

				if (bibli.get(i).getISBN().equals(autor)) {
					bibli.remove(i);
					System.out.println("Livro Removido!!!");
				} else {
					System.out.println("CADASTRO INESISTENTE!!!");
				}
			}
			menuLivrosBibliotecario();
		}

		public Bibliotecario() {
			super();
			addManualLivros();
		}
		
}
