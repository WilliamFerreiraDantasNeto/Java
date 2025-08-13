package programa03_estrutura_condicional;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		//Ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x%2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Ímpar");
		}
		
		sc.close();

	}

}
