package br.com.devinhouse.exercicios8_9_15_16.models;

public abstract class Conta {
	private static int totalDeContas;
	private String nomeDoTitular, dataDeAbertura, tipo;
	private int numero, agencia;
	protected double saldo, limite;
	
	public Conta(String nomeDoTitular, int numero, int agencia, double saldo, double limite, String dataDeAbertura) {
		this.nomeDoTitular = nomeDoTitular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.limite = limite;
		this.dataDeAbertura = dataDeAbertura;
		Conta.totalDeContas++;
	}
	

	public boolean sacar(double valor) {
		if(this.saldo - valor <= this.getSaldoComLimite() && this.saldo - valor > this.limite * -(1)) {
			 this.saldo -= valor;
			 System.out.printf("%nO valor de R$%.2f foi sacado com sucesso!%n", valor);
			 return true;
		}
		System.out.printf("%nSaldo insuficiente! R$%.2f %n", valor);
		return false;
	}
	
	public boolean depositar(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			System.out.printf("%nO valor de R$%.2f foi depositado com sucesso!%n", valor);
			return true;
		}
		return false;
	}
	
	public void setSaldo(double valor) {
		this.sacar(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setLimite(double limite) {
		if(limite < 0) {
			this.limite = limite;
		}
		
	}
	
	public double getLimite() {
		return this.limite;
	}
	

	public double getSaldoComLimite() {
		return this.limite + this.saldo;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	
	public abstract String getTipo();
	
	/*public String getTipo() {
		return "Conta";
	}*/

	public void imprimirDados() {
		System.out.printf("Saldo: R$%.2f Limite de saque: R$%.2f. %n",
				 this.getSaldo(), this.getSaldoComLimite());
	}

	public void recuperaDadosParaImpressao() {
		System.out.printf("%nTitular da conta:  %s %nNúmero da conta: %d-%d%nSaldo: R$%.2f%nCheque especial: R$%.2f %nData de abertura: %s %nTotal de Contas: %d %n",
				this.nomeDoTitular, this.numero, this.agencia, this.getSaldo(), this.getLimite(), this.dataDeAbertura, Conta.totalDeContas);
	}

}