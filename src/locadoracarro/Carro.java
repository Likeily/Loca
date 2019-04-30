package locadoracarro;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Henrique & Likeily Medeiros
 */
public class Carro implements Serializable {
	private static final long serialVersionUID = 1L;

	// Atributos
	private int id;
	private String marca;
	private String modelo;
	private String cor;
	private String combustivel;
	private float motor;
	private float kmRodados;
	int quantidade = 15;
	boolean disponivel;
	int capacidade = 50;

	Carro carro[];

	// Construtor

	public Carro() {

	}

	public Carro(int id, String marca, String modelo, String cor, String combustivel, float motor, float kmRodados,
			int quantidade, boolean disponivel, int capacidade) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.combustivel = combustivel;
		this.motor = motor;
		this.kmRodados = kmRodados;
		this.disponivel = disponivel;
		this.quantidade = quantidade;
		this.capacidade = capacidade;

	}

	// Métodos

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade() {
		carro = new Carro[15];
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void cadastrarCarro() {
		if (this.quantidade < this.capacidade) {
			carro[this.quantidade] = new Carro();
			this.quantidade++;
		}
	}

	public Carro pesquisarCarro(String n) {
		for (int i = 0; i < quantidade; i++) {
			if (carro[i].getModelo() == n)
				return carro[i];
		}
		return null;
	}

	class ManipularPesquisa implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, getMarca());
		}
	}

	public void detalhes() {

		System.out.println("Marca : " + marca + " | " + "Modelo : " + modelo + " | " + "Cor : " + cor + " | "
				+ "Combustivel : " + combustivel + " | " + "Motor : " + motor + " | " + "Quantidade : " + quantidade);

	}

	public void alugado() {
		if (this.disponivel == false) {
			System.out.println("Marca: " + this.getMarca() + " | " + "Modelo: " + this.getModelo());
		}
	}

	public void disp() {
		if (this.disponivel == true) {
			System.out.println("Marca: " + this.getMarca() + " | " + "Modelo: " + this.getModelo());
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (disponivel == false) {
			this.id = id;
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public float getMotor() {
		return motor;
	}

	public void setMotor(float motor) {
		this.motor = motor;
	}

	public float getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(float kmRodados) {
		this.kmRodados = kmRodados;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	

	@Override
	public String toString() {
		return "Carros [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", combustivel="
				+ combustivel + ", motor=" + motor + ", kmRodados=" + kmRodados + ", quantidade=" + quantidade
				+ ", disponivel=" + disponivel + ", capacidade=" + capacidade + ", carro=" + Arrays.toString(carro)
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
