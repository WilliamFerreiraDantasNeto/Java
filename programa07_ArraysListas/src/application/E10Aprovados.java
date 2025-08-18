package application;

import java.util.Scanner;

import entities.Aluno;

public class E10Aprovados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos alunos serao digitados?");
		int n = sc.nextInt();
		Aluno[] vect = new Aluno[n];
		
		for (int i=0 ; i< vect.length; i++) {
			int j = i+1;
			System.out.println("Digite nome, primeira e segunda nota do " + j + "o aluno: ");
			sc.nextLine();
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vect[i] = new Aluno(nome, nota1, nota2);
		}
		System.out.println("Alunos aprovados:");
		for (int i = 0; i<vect.length; i++) {
			if(vect[i].media()>=6) {
				System.out.println(vect[i].getName());
			}
		}
				
		sc.close();
	}

}
