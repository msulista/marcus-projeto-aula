package br.com.caelum.vraptor.model;

public class Carro extends Veiculo{
	
	private String marca;
	private String modelo;
	private int ano;
	private double preco;
	
	public Carro(String chassi, String marca, String modelo, int ano, double preco) {
		// TODO Auto-generated constructor stub
		super(chassi, marca, modelo);		
		this.ano = ano;
		this.preco = preco;
	}	

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
