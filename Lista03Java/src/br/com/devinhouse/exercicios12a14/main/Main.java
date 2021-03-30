package br.com.devinhouse.exercicios12a14.main;

import br.com.devinhouse.exercicios12a14.models.Funcionario;
import br.com.devinhouse.exercicios12a14.models.FuncionarioAssalariado;
import br.com.devinhouse.exercicios12a14.models.FuncionarioComissionado;
import br.com.devinhouse.exercicios12a14.models.FuncionarioHorista;
import br.com.devinhouse.exercicios12a14.models.FuncionarioPorPeca;

public class Main {

	public static void main(String[] args) {
		FuncionarioAssalariado fa = new FuncionarioAssalariado("Passoa 1", "Assalariado", "13/10/1990", 1500);
		FuncionarioComissionado fc = new FuncionarioComissionado("Pessoa 2", "Comissionado","13/03/1993", 2500, 0.75);
		FuncionarioHorista fh = new FuncionarioHorista("Pessoa 3", "Horista", "01/07/2003", 5, 1500);
		FuncionarioPorPeca fp = new FuncionarioPorPeca("Pessoa 4", "Peça", "11/11/1994", 2000, 15);
		
		Funcionario arrayFuncionarios[] = new Funcionario[Funcionario.getTotalDeFuncionarios()];
		
		arrayFuncionarios[0] = fa;
		arrayFuncionarios[1] = fc;
		arrayFuncionarios[2] = fh;
		arrayFuncionarios[3] = fp;
		
		double valorFolha = 0;
		
		for(Funcionario func: arrayFuncionarios) {
			System.out.println(func);
			valorFolha += func.calcularSalarioMensal();
		}
		System.out.println("Folha de pagamento: R$"+valorFolha);
	}

}
