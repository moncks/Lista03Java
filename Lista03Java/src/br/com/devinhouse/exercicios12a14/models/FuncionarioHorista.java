package br.com.devinhouse.exercicios12a14.models;

public class FuncionarioHorista extends Funcionario {
	private double horas, valorHora;
	
	public FuncionarioHorista(String nome, String sobrenome, String dataNascimento, double horas, double valorHora) {
		super(nome, sobrenome, dataNascimento);
		this.horas = validarHora(horas);
		this.valorHora = validarValorPositivo(valorHora);
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		if (horas >= 0 && horas <= 168) {
			this.horas = horas;
		}
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		if (valorHora > 0) {
			this.valorHora = valorHora;
		}
	}
	
	private double validarHora(double valor) {
		if (valor >= 0 && valor <= 168) {
			return valor;
		}
		return 0;
	}
	
	@Override
	public double calcularSalarioMensal() {
		return valorHora * horas;
	}
	
	@Override
	public String toString() {
		return (super.toString()+ String.format("%n%s: %.2f %n%s: %.2f %n",
				"Horas Trabalhadas", this.horas, "Valor Hora", this.valorHora));
	}
	
	

}
