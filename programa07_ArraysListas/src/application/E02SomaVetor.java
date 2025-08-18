package application;

import java.util.Scanner;

public class E02SomaVetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0 ; i< vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble(); 
		}
		
		double sum=0;
		
		System.out.print("Valores = ");
		
		for (int i=0 ; i< vect.length; i++) {
			System.out.print(vect[i] + " ");
			sum+=vect[i];
		}
		
		System.out.println();
		System.out.println("Soma = " + sum);
		System.out.println("Media = "+  sum/vect.length);
		
		sc.close();
	}

}
