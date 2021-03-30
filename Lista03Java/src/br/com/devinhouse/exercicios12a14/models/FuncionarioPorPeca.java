package br.com.devinhouse.exercicios12a14.models;

public class FuncionarioPorPeca extends Funcionario{
	//private int pecasProduzidas;
	private double precoPorPeca, pecasProduzidas;
	
	public FuncionarioPorPeca(String nome, String sobrenome, String dataNascimento, double pecasProduzidas, double precoPorPeca) {
		super(nome, sobrenome, dataNascimento);
		this.pecasProduzidas = validarValorPositivo(pecasProduzidas);
		this.precoPorPeca = precoPorPeca;
	}

	public double getPecasProduzidas() {
		return pecasProduzidas;
	}

	public void setPecasProduzidas(int pecasProduzidas) {
		this.pecasProduzidas = pecasProduzidas;
	}

	public double getPrecoPorPeca() {
		return precoPorPeca;
	}

	public void setPrecoPorPeca(double precoPorPeca) {
		this.precoPorPeca = precoPorPeca;
	}
	
	@Override
	public double calcularSalarioMensal() {
		return this.pecasProduzidas * this.precoPorPeca;
	}
	
	@Override
	public String toString() {
		return (super.toString()+ String.format("%n%s: %.2f %n%s: %.2f %n",
				"Peças Produzidas", this.pecasProduzidas, "Remuneração por Peça", this.precoPorPeca));
	}


}
