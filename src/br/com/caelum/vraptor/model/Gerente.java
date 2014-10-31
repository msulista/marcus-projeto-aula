package br.com.caelum.vraptor.model;

public class Gerente  extends Pessoa{
	
	private int matricula;
	private int loja;
	
	public Gerente(String nome, String cpf, int matricula, int loja) {
		// TODO Auto-generated constructor stub
		
		super(nome, cpf);
		this.matricula = matricula;
		this.loja = loja;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getLoja() {
		return loja;
	}

	public void setLoja(int loja) {
		this.loja = loja;
	}
	
	
	

}
