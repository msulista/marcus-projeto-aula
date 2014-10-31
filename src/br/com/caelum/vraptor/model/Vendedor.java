package br.com.caelum.vraptor.model;

import java.awt.List;
import java.util.ArrayList;

public class Vendedor  extends Pessoa{
	
	//private List<Vendas> vendas;	
	private int matricula;
	private ArrayList<Vendas> vendas;
	
	public Vendedor(String nome, String cpf, int matricula) {
		// TODO Auto-generated constructor stub
		super(nome, cpf);
		this.vendas = new ArrayList<Vendas>();
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Vendas> getVendas() {
		return vendas;
	}

	public void setVendas(ArrayList<Vendas> vendas) {
		this.vendas = vendas;
	}
	
	
	
	

}
