package Biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Leitor extends Pessoa {
	int x;
	private ArrayList<Leitor> pessoaLeitor = new ArrayList<Leitor>();

	public void cadastroLeitor() throws ParseException {
		Scanner input = new Scanner(System.in);
		Leitor L = new Leitor();

		System.out.println("Cadastro Leitor");
		System.out.println("Nome: ");
		L.setNome(input.nextLine());

		System.out.println("CPF: ");
		L.setCpf(input.next());
		System.out.println("Data de Nascimento(dd/mm/aa): ");
		String dataRecebida = input.next();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(dataRecebida);
		L.setDataDeNascimento(date);

		System.out.println("Idade: ");
		L.setIdade(input.nextInt());

		pessoaLeitor.add(L);
		System.out.println("Aluno adicionado ao banco de dados com sucesso!!!");
		menuLeitor();
	}

	// Atrelar a login??? - Analisar Método
	public void atualizarLeitor(String cpf) throws ParseException {
		Leitor m = new Leitor();
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o cpf para atualizar: ");
		cpf = sc.next();

		for (int i = 0; i < pessoaLeitor.size(); i++) {

			if (pessoaLeitor.get(i).getCpf().equals(cpf)) {

				System.out.println("Nome: ");
				m.setNome(input.nextLine());

				System.out.println("CPF: ");
				m.setCpf(input.next());
				System.out.println("Data de Nascimento(dd/mm/aa): ");
				String dataRecebida = input.next();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date date = sdf.parse(dataRecebida);
				m.setDataDeNascimento(date);

				System.out.println("Idade: ");
				m.setIdade(input.nextInt());
				pessoaLeitor.set(i, m);
				System.out.println("Cadastro Atualizado!!!");
			} else {
				System.out.println("CPF INESISTENTE!!!");
			}
		}
		menuLeitor();
	}

	// Pesquisar Livros p/ ISBN
	public Livros pesquisarLivroISBN(String iSBN) {
		Scanner input = new Scanner(System.in);
		System.out.println("Busca Livro");
		System.out.println("ISBN: ");
		iSBN = input.next();

		for (int i = 0; i < bibli.size(); i++) {

			if (bibli.get(i).getISBN().equals(iSBN)) {
				System.out.println("Código: ");
				bibli.get(i).getCodigo();
				System.out.println("Título: ");
				bibli.get(i).getTitulo();
				System.out.println("Autor/a: ");
				bibli.get(i).getAutor();
				System.out.println("ISBN: ");
				bibli.get(i).getISBN();
				System.out.println("Quantidade: ");
				bibli.get(i).getQuantidade();
				System.out.println("Gênero: ");
				bibli.get(i).getGenero();
				System.out.println("Páginas: ");
				bibli.get(i).getNumero_de_paginas();
				System.out.println("Edição: ");
				bibli.get(i).getEdicao();
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
			System.out.println("ISBN: ");
			titulo = input.next();

			for (int i = 0; i < bibli.size(); i++) {

				if (bibli.get(i).getTitulo().equals(titulo)) {
					System.out.println("Código: ");
					bibli.get(i).getCodigo();
					System.out.println("Título: ");
					bibli.get(i).getTitulo();
					System.out.println("Autor/a: ");
					bibli.get(i).getAutor();
					System.out.println("ISBN: ");
					bibli.get(i).getISBN();
					System.out.println("Quantidade: ");
					bibli.get(i).getQuantidade();
					System.out.println("Gênero: ");
					bibli.get(i).getGenero();
					System.out.println("Páginas: ");
					bibli.get(i).getNumero_de_paginas();
					System.out.println("Edição: ");
					bibli.get(i).getEdicao();
					return bibli.get(i);
				}
			}
			System.out.println("Cadastro não localizado!");
			return null;
		}
		
		public Livros ler(String titulo) {
			Scanner input = new Scanner(System.in);
			System.out.println("Escolha um Livro");
			System.out.println("Titulo:: ");
			titulo = input.next();

			for (int i = 0; i < bibli.size(); i++) {

				if (bibli.get(i).getTitulo().equals(titulo)) {
					System.out.println("Código: ");
					bibli.get(i).getCodigo();
					System.out.println("Título: ");
					bibli.get(i).getTitulo();
					System.out.println("Autor/a: ");
					bibli.get(i).getAutor();
					System.out.println("ISBN: ");
					bibli.get(i).getISBN();
					System.out.println("Quantidade: ");
					bibli.get(i).getQuantidade();
					System.out.println("Gênero: ");
					bibli.get(i).getGenero();
					System.out.println("Páginas: ");
					bibli.get(i).getNumero_de_paginas();
					System.out.println("Edição: ");
					bibli.get(i).getEdicao();
					System.out.println("Já leu quantas páginas: ");
					int p = input.nextInt();
					System.out.println("Fatam "+(bibli.get(i).getNumero_de_paginas() - p) + " para terminar o livro!!!");
;					return bibli.get(i);
				}
			}
			System.out.println("Cadastro não localizado!");
			return null;
		}
}
