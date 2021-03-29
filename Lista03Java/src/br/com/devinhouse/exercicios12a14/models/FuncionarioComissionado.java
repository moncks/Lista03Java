package br.com.devinhouse.exercicios12a14.models;

public class FuncionarioComissionado extends Funcionario {
	private double vendas, taxaComissao;
	
	public FuncionarioComissionado(String nome, String sobrenome, double vendas, double taxaComissao) {
		super(nome, sobrenome);
		if(vendas < 0) {
			this.vendas = 0;
		}
		this.vendas = vendas;
		
		if(taxaComissao > 0 && taxaComissao < 1) {
			this.taxaComissao = taxaComissao;
		}
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public double getTaxaComissao() {
		return taxaComissao;
	}

	public boolean setTaxaComissao(double taxaComissao) {
		if(taxaComissao < 0 || taxaComissao > 1) {
			return false;
		}
		this.taxaComissao = taxaComissao;
		return true;
	}
	
	@Override
	public double calcularSalarioMensal() {
		return taxaComissao * vendas;
	}
	
	@Override
	public String toString() {
		return (super.toString()+ String.format("%n%s: %.2f %n%s: %.2f %n",
				"Vendas", this.vendas, "Comissão", this.taxaComissao));
	}

}
