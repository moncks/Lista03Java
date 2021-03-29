package br.com.devinhouse.exercicios12a14.models;

public abstract class Funcionario {
	private String nome, sobrenome;
	
	public Funcionario(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public abstract double calcularSalarioMensal();
	
	@Override
	public String toString() {
		return String.format("%n%s: %s %s %n%s: %.2f%n",
				"Nome", this.nome, this.sobrenome, "Salário", this.calcularSalarioMensal());
	}

}
/*
Deve existir uma classe abstrata “Funcionario” 
contendo os atributos nome e sobrenome, 
um construtor, 
uma sobrescrita do método toString, 
e um método abstrato “calcularSalarioMensal()”, que deve ser implementado pelas subclasses concretas. 
*/