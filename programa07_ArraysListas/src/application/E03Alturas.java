package application;

import java.util.Scanner;

import entities.Pessoas;

public class E03Alturas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		
		int n = sc.nextInt();
		
		Pessoas[] vect = new Pessoas[n];
		
		for (int i=0 ; i< vect.length; i++) {
			System.out.println("Dados da " + (i+1) + "ª pessoa: ");
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Pessoas(nome, idade, altura);
			
		}
		
		double sum=0.0;
		
		for (int i=0 ; i< vect.length; i++) {
			sum+=vect[i].getAltura();
		}
		System.out.println();
		System.out.printf("Altura média: %.2f%n", sum/vect.length);
		
		int count = 0;
		
		for (int i=0 ; i< vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				count++;
			}
		}
		
		double percent = count*100.0/vect.length;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		for (int i=0 ; i< vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}

}