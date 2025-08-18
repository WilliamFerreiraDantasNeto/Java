package application;

import java.util.Scanner;

import entities.PessoasE11;

public class E11DadosPessoas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serao digitadas? ");
		
		int countM=0, countF=0, n = sc.nextInt();
		double alturaF=0, menorAltura=100, maiorAltura=0;
		PessoasE11[] vect = new PessoasE11[n];
		
		for (int i=0; i< vect.length; i++) {
			int j = i+1;
			
			System.out.println("Altura da " + j + "a pessoa: ");
			double altura = sc.nextDouble();
			
			System.out.println("Genero da " + j + "a pessoa: ");
			sc.nextLine();
			char genero = sc.nextLine().charAt(0);
			vect[i] = new PessoasE11(altura, genero);
		}
		
		for(int i=0; i<vect.length; i++) {
			if (vect[i].getAltura()<menorAltura) {
				menorAltura=vect[i].getAltura();
			}
			if (vect[i].getAltura()>maiorAltura) {
				maiorAltura=vect[i].getAltura();
			}
			if(vect[i].getGenero() =='M' || vect[i].getGenero() == 'm') {
				countM++;
			}
			else {
				countF++;
				alturaF+=vect[i].getAltura();
			}
		}
		
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", alturaF/countF);
		System.out.println("Numero de homens = " + countM);
				
		sc.close();
	}

}
