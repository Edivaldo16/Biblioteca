package Biblioteca;

import java.util.Date;

public class Pessoa extends Biblioteca{
	private String nome;
	private String cpf;
	private int idade;
	private Date dataDeNascimento;

	// Métodos Personalizados
	
	//Menu Principal
	public void menuPrincipal() {
		System.out.println("Menu Principal");
		System.out.println("1 - Bibliotecário");
		System.out.println("2 - Leitor");
		System.out.println("0 - Sair");
		System.out.println("Escolha uma opção: ");
	}
	
	public void loginBibliotecario() {
		//CPF e Senha
	}
	
	public void menuBibliotecario() {
		System.out.println("Menu Bibliotecario");
		System.out.println("Bem vindo a biblioteca "); // +this.getBiblioteca(alguma coisa assim)
		System.out.println("1 - Leitores");
		System.out.println("2 - Livros");
		System.out.println("0 - Sair");
		System.out.println("Escolha uma opção: ");
	}

	// Cadastrar, Pesquisar, Listar, Atualizar, Remover Leitores
	//Sub_menu de menuBibliotecario()
	public void menuLeitoresBibliotecario() {
		System.out.println("Menu Bibliotecário");
		System.out.println("1 - Cadastrar Leitores"); 
		System.out.println("2 - Pesquisar Leitores"); 
		System.out.println("3 - Listar Leitores"); 
		System.out.println("4 - Atualizar Leitores");
		System.out.println("5 - Remover Leitores");
		System.out.println("0 - Sair");
		System.out.println("Escolha uma opção: ");
	}
	// Cadastrar, Pesquisar, Listar, Atualizar, Remover Livros
	//Sub_menu de menuBibliotecario()
	public void menuLivrosBibliotecario() {
		System.out.println("Menu Bibliotecário");
		System.out.println("1 - Cadastrar Livros"); 
		System.out.println("2 - Pesquisar Livros (ISBN)"); 
		System.out.println("3 - Pesquisar Livros (Título)");
		System.out.println("4 - Listar Livros"); //Todos os livros
		System.out.println("5 - Listar Gêneros");
		System.out.println("6 - Listar Livros p/Gênero"); //Todos os livros daquele Gênero
		System.out.println("7 - Atualizar Livros (ISBN)");
		System.out.println("8 - Atualizar Livros (Título)");
		System.out.println("9 - Remover Livros");
		System.out.println("0 - Sair");
		System.out.println("Escolha uma opção: ");
	}
	
	public void loginLeitor() {
		//CPF e Senha
	}

	public void menuLeitor() {
		System.out.println("Menu Leitor");
		System.out.println("1 - Cadastrar Leitor");
		System.out.println("2 - Atualizar Cadastro Leitor");
		System.out.println("3 - Remover Leitor");
		System.out.println("4 - Pesquisar Livros (ISBN)"); 
		System.out.println("5 - Pesquisar Livros (Título)"); 
		System.out.println("6 - Listar Livros");
		System.out.println("7 - Listar Gêneros");
		System.out.println("8 - Listar Livros p/Gênero"); //Todos os livros daquele Gênero
		System.out.println("0 - Sair");
		System.out.println("Escolha uma opção: ");
	}

	// Métodos Especiais:
	// Constructor
	public Pessoa() {

	}

	public Pessoa(String nome, String cpf, int idade, Date dataDeNascimento) {
		super();
		this.setNome(nome);
		this.setCpf(cpf);
		this.setIdade(idade);
		this.setDataDeNascimento(dataDeNascimento);
	}

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
}
