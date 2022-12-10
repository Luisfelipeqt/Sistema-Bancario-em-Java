package Entities;

public class Banco {
	private int conta;
	private String name;
	private double saldo;
	
	
	public Banco(int conta, String name, double depositoInicial) {
		this.conta = conta;
		this.name = name;
		depositoConta(depositoInicial);
	}
	
	public Banco(int conta, String name) {
		this.conta = conta;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getConta() {
		return conta;
	}
	
	public void depositoConta(double deposito) {
		this.saldo += deposito;
	}
	
	public void saqueConta(double saque) {
		this.saldo = (this.saldo - saque) - 5;
	}
	
	public String toString() {
		return "Account "
				+ conta
				+ ", Holder: "
				+ name
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
}
