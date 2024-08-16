package entities;

public class ContaPoupanca extends ContaBancaria {

	private Double saldo;	

	public ContaPoupanca(Integer agencia, Integer numero, String nome, Double saldo) {
		super(agencia, numero, nome);
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void depositar(Double valor) {
		this.saldo += valor;
	}
		
	public void sacar(Double valor) throws Exception {
		if (this.saldo >= valor) {
			this.saldo -= valor;
		}
		if (this.saldo <= valor) {
			throw new Exception("Saldo indisponivel em conta para saque. Valor disponivel: " + saldo);
		}
		
	}
	@Override
	public String toString() {
		return "Numero da agencia : " + getAgencia()
				+ "\nNumero da conta poupanca: " + getNumero()
				+ "\nNome: " + getNome()
				+ "\nSaldo atual: " + getSaldo()
				;
	}
	
}
