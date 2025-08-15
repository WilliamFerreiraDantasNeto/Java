package programa02_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class E4SalarioHora {

	public static void main(String[] args) {
		/*Fazer um programa que leia o número de um funcionário, 
		 * seu número de horas trabalhadas, o valor que recebe por
		 * hora e calcula o salário desse funcionário. A seguir, mostre 
		 * o número e o salário do funcionário, com duas casas decimais.
		 */ 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numFunc, horas;
		double valor, salario;
		
		numFunc = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();
		salario = horas*valor;
		System.out.println("Number = " + numFunc);
		System.out.printf("Salary = U$ %.2f", salario);
		
		sc.close();
	}

}
