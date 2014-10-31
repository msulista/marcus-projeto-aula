package br.com.caelum.vraptor.model;

public abstract class Veiculo {
	
	private String chassi;
	private String marca;
	private String modelo;
	
	public Veiculo(String chassi, String marca, String modelo) {
		// TODO Auto-generated constructor stub
		this.chassi = chassi;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	

}
