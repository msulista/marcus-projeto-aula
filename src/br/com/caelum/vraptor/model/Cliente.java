package br.com.caelum.vraptor.model;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class Cliente extends Pessoa{
	
	private String idCliente;
	
	public Cliente(String nome, String cpf, String id_cliente){
		
		super(nome, cpf);
		this.idCliente = id_cliente;		
	}	
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
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

}
