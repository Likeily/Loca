package locadoracarro;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Henrique & Likeily Medeiros
 */
public class CadastroClientes implements Serializable{
	private static final long serialVersionUID = 1L;

	private String nome;
	private int idade;
	private String endereco;
	private String rg;
	private String cpf;
	private Scanner teclado;
	Carro carros;

	public CadastroClientes(String nome, int idade, String endereco, String rg, String cpf, Carro carros) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.rg = rg;
		this.cpf = cpf;
		this.carros = carros;
	}

	public CadastroClientes() {

	}

	public void mostrar() {
		System.out.println("");
		System.out.println("");
		System.out.println(">> Cadastro realizado com sucesso. <<");
		System.out.println("");
		System.out.println("");
		System.out.println("Nome: " + this.getNome() + " | " + " Idade: " + this.getIdade() + " anos" + " | "
				+ " EndereÃ§o: " + this.getEndereco() + " | " + " RG: " + this.getRg() + " | " + " CPF: "
				+ this.getCpf() + "Carro Alugado: " + this.getCarros().toString());
	}

	public void alugar() {
		teclado = new Scanner(System.in);

		System.out.println("");
		System.out.println("Preencha as informacoes a seguir:");
		System.out.println("");

		System.out.print("Nome: ");
		this.nome = teclado.nextLine();

		System.out.print("Idade: ");
		this.idade = teclado.nextInt();

		if (idade >= 18) {

			System.out.print("Endereco: ");
			this.endereco = teclado.nextLine();
			this.endereco = teclado.nextLine();

			System.out.print("RG: ");
			this.rg = teclado.nextLine();

			System.out.print("CPF: ");
			this.cpf = teclado.nextLine();
			System.out.println("");

			System.out.println("Qual carro deseja Alugar? ");
		} else {
			System.out.println("Nao permitido, voce eh menor de idade.");
		}

	}

	//Gera um número(código) único para buscas serem realizadas mais rápido
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}
	
	//Compara o cliente pelo CPF

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroClientes other = (CadastroClientes) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Carro getCarros() {
		return carros;
	}

	public void setCarros(Carro carros) {
		this.carros = carros;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


}
