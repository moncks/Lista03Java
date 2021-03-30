package br.com.devinhouse.exercicios12a14.models;

public class FuncionarioAssalariado extends Funcionario {
	private double salario;
	
	public FuncionarioAssalariado(String nome, String sobrenome, String dataNascimento, double salario) {
		super(nome, sobrenome, dataNascimento);
		this.salario = salario;
		
	}
	
	
	public void setSalario(double salario) {
		this.salario = salario;
	}


	@Override
	public double calcularSalarioMensal() {
		return this.salario;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
