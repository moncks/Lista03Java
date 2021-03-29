package br.com.devinhouse.exercicios8_9_15_16.models;

import br.com.devinhouse.exercicios8_9_15_16.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {
	private String titular;
	private double valor;
	private int numeroApolice;
	
	public SeguroDeVida(String titular, double valor) {
		this.titular = titular;
		this.valor = valor;
		this.numeroApolice = (int) (Math.random() * (1000 - 1) + 1 );
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getNumeroApolice() {
		return numeroApolice;
	}

	public void setNumeroApolice(int numeroApolice) {
		this.numeroApolice = numeroApolice;
	}
	
	@Override
	public double getValorImposto() {
		return (valor * 0.02) + 42;
	}
	
	public void imprimirSeguro() {
		System.out.printf("%nTitular: %s %nValor: R$%.2f %nApolice: %d %nValor do Imposto: R$%.2f%n",
				this.titular, this.valor, this.numeroApolice, this.getValorImposto());
	}

}
