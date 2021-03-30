package br.com.devinhouse.exercicios12a14.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Locale;



public abstract class Funcionario {
	private String nome, sobrenome, dataNascimento;
	private static int totalDeFuncionarios;
	private int idade;
	
	public Funcionario(String nome, String sobrenome, String dataNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.totalDeFuncionarios++;
	}
	
	public static Date StringToDate(String dataNascimento) throws ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Date date = formatter.parse(dataNascimento);
		return date;
	}
	
	public int getIdade() throws ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formatter.parse(this.getDataNascimento());

		Instant instant = date.toInstant();
		ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
		LocalDate givenDate = zone.toLocalDate();

		Period period = Period.between(givenDate, LocalDate.now());
		period.getYears();

		return idade = period.getYears();
	}
	
	/*
	public boolean mesAniversario() {
		Month mes = LocalDate.now().getMonth();
		Locale local = new Locale("pt", "BR");
		if(this.getIdade(Month) == mes) {
			return true;
	}
		return false;
		
	}
	*/
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public static int getTotalDeFuncionarios() {
		return totalDeFuncionarios;
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
	
	protected double validarValorPositivo(double valor) {
		if(valor >= 0) {
			return valor;
		}
		return 0;
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