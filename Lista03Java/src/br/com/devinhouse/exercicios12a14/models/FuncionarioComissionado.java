package br.com.devinhouse.exercicios12a14.models;

public class FuncionarioComissionado extends Funcionario {
	private double vendas, taxaComissao;
	
	public FuncionarioComissionado(String nome, String sobrenome, String dataNascimento, double vendas, double taxaComissao) {
		super(nome, sobrenome, dataNascimento);
		this.vendas = validarValorPositivo(vendas);
		this.taxaComissao = validarPercentual(taxaComissao);
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = validarValorPositivo(vendas);
	}

	public double getTaxaComissao() {
		return taxaComissao;
	}

	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = validarPercentual(taxaComissao);
	}
	
	private double validarPercentual(double valor) {
		if(valor > 0 && valor < 1) {
			return valor;
		}
		return 0;
	}
	
	@Override
	public double calcularSalarioMensal() {
		return this.taxaComissao * this.vendas;
	}
	
	@Override
	public String toString() {
		return (super.toString()+ String.format("%n%s: %.2f %n%s: %.2f %n",
				"Vendas", this.vendas, "Comissão", this.taxaComissao));
	}

}
