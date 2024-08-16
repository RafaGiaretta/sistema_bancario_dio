package entities;

public class ContaBancaria {
	
	private Integer agencia;
	private Integer numero;
	private String nome;

	
	public ContaBancaria(Integer agencia, Integer numero, String nome) {
		this.agencia = agencia;
		this.numero = numero;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
}
