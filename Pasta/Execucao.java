package Biblioteca;

import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) throws Exception {
		Scanner t = new Scanner(System.in);
		Pessoa pe = new Pessoa();
		pe.menuPrincipal(); // MenuPrincipal
		int o;

		// 1 - Submenu Bibliotecario
		do {
			o = t.nextInt();
			switch (o) {
			case 1:
				Scanner input = new Scanner(System.in);
				Bibliotecario p = new Bibliotecario();
				p.menuBibliotecario();

				int opcao;
				do {
					opcao = input.nextInt();
					switch (opcao) {
					case 1:
						p.menuLeitoresBibliotecario();
						Leitor pr = new Leitor();
						int y;
						do {
							y = input.nextInt();
							switch (y) {
							case 1:
								pr.cadastroLeitor();
								break;
							}

						} while (opcao != 0);
						break;
					case 2:
						p.menuLivrosBibliotecario();
						Bibliotecario bi = new Bibliotecario();
						int i;
						do {
							i = input.nextInt();
							switch (i) {
							case 1:
								bi.cadastrarLivros();
								break;
							case 2:
								bi.pesquisarLivroISBN(null);
								p.menuLivrosBibliotecario();
								break;
							case 3:
								bi.pesquisarLivroTitulo(null);
								p.menuLivrosBibliotecario();
								break;
							case 4:
								bi.listarLivroPorGenero();
								break;
							case 5:
								bi.listarGenero();
								break;
							case 6:
								bi.listarLivroPorGenero();
								break;
							case 7:
								bi.atualizarLivroISBN(null);
								p.menuLivrosBibliotecario();
								break;
							case 8:
								bi.atualizarLivroTitulo(null);
								p.menuLivrosBibliotecario();
								break;
							case 9:
								bi.removerLivroAutor(null);
								p.menuLivrosBibliotecario();
								break;
							case 0:
								pe.menuPrincipal();
								break;
							default:
								p.menuLivrosBibliotecario();
							}

						} while (opcao != 0);
						break;
					case 0:
						pe.menuPrincipal();
						break;
					default:
						System.out.println("ESCOLHA ENTRE UMA DAS OPÇÕES: 0 - 2");
						
					}
				} while (opcao != 0);
				break;
			case 2:
				// 2 - Submenu Leitores
				Scanner sc = new Scanner(System.in);
				int op;

				// O switch case também pode ser feito dessa outra forma:
				do {
					op = sc.nextInt();
					switch (op) {
					case 1:
						pe.menuLeitor();
						break;
					case 0:
						pe.menuPrincipal();
						break;
					default:
						System.out.println("ESCOLHA ENTRE UMA DAS OPÇÕES: 0 - 1");
					}
				} while (op != 0);
				break;
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("ESCOLHA ENTRE UMA DAS OPÇÕES: 0 - 2");
				pe.menuPrincipal();
			}
		} while (o != 0);
	}
}
