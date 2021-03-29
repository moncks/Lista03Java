package br.com.devinhouse.exercicios8_9_15_16.models;

import br.com.devinhouse.exercicios8_9_15_16.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(String nomeDoTitular, int numero, int agencia, double saldo, double limite, String dataDeAbertura) {
		super(nomeDoTitular, numero, agencia, saldo, limite, dataDeAbertura);
	}
	
	@Override
	public boolean sacar(double valor) {
		valor = 0.10;
		if(this.saldo - valor <= this.getSaldoComLimite() && this.saldo - valor > this.limite * -(1)) {
			 this.saldo -= valor;
			 System.out.printf("%nO valor de R$%.2f foi sacado com sucesso!%n", valor);
			 return true;
		}
		System.out.printf("%nSaldo insuficiente! R$%.2f %n", valor);
		return false;
	}
	
	@Override
	public String getTipo() {
		return "Conta Corrente";
	}
	
	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
	
	@Override
	public void recuperaDadosParaImpressao() {
		super.recuperaDadosParaImpressao();
		System.out.printf("Valor do Imposto: %.2f %n", this.getValorImposto());
	}
}
	

/*
Utilizando o projeto de Sistema Bancário dos exercícios da semana passada, 
crie a subclasse ContaCorrente, 
herdando da classe Conta. 
Na classe ContaCorrente, sobrescreva o método sacar 
para invocar o método da superclasse 
e adicionalmente retirar R$0,10 do saldo.
*/