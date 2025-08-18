package application;

import java.util.Scanner;

public class E05MaiorPosicao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");	
		
		int n = sc.nextInt(), localMaior=0;
		double maior=0;
		double[] vect = new double[n];
		
		for (int i = 0; i<vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if (vect[i]>maior) {
				maior = vect[i];
				localMaior = i;
			}
		}
		
		System.out.println("MAIOR VALOR = " + maior);
		System.out.print("POSICAO DO MAIOR VALOR = "+ localMaior);
		
		sc.close();
	}

}
