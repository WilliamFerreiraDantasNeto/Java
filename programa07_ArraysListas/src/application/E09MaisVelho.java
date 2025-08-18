package application;

import java.util.Scanner;

import entities.PessoasE09;

public class E09MaisVelho {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas voce vai digitar? ");
		
		int n = sc.nextInt();
		PessoasE09[] vect = new PessoasE09[n];
		
		for (int i=0 ; i< vect.length; i++) {
			int j = i+1;
			System.out.println("Dados da " + j + "ª pessoa: ");
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			
			vect[i] = new PessoasE09(nome, idade);
			
		}
		
		
		int idade=0;
		int ref=0;
		
		for (int i=0 ; i< vect.length; i++) {
			if (vect[i].getIdade()>idade){
				idade=vect[i].getIdade();
				ref=i;
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + vect[ref].getName());
		
		
		sc.close();
	}

}
