package br.com.caelum.vraptor.model;

public class Bicicleta extends Veiculo{
	
	private String preco;
	
	public Bicicleta(String chassi, String marca, String modelo, String preco) {
		// TODO Auto-generated constructor stub
		super(chassi, marca, modelo);
		this.preco = preco;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}
}
