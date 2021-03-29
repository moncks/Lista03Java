package br.com.devinhouse.exercicios8_9_15_16.models;

public class ContaPoupanca extends Conta {
	private double jurosPoupanca;

	public ContaPoupanca(String nomeDoTitular, int numero, int agencia, double saldo, double limite, String dataDeAbertura) {
		super(nomeDoTitular, numero, agencia, saldo, limite, dataDeAbertura);
	}
	
	public void renderJurosDePoupanca(double juros) {
		this.jurosPoupanca = this.saldo * (juros/100);
		saldo += jurosPoupanca;
	}
	
	@Override
	public String getTipo() {
		return "Conta Poupanca";
	}
}
/*
Utilizando o projeto de Sistema Bancário dos exercícios da semana passada, 
crie a subclasse ContaPoupanca, herdando da classe Conta. 
Crie um método “renderJurosDePoupanca” na subclasse,
 que deve adicionar ao saldo 0.1% do seu valor.
*/