package br.com.devinhouse.exercicios12a14.models;

public class FuncionarioAssalariado extends Funcionario {
	private double salario;
	
	public FuncionarioAssalariado(String nome, String sobrenome, double salario) {
		super(nome, sobrenome);
		this.salario = salario;
		
	}
	
	@Override
	public double calcularSalarioMensal() {
		return salario;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
