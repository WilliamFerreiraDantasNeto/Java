package application;

import java.util.Scanner;

public class E04NumerosPares {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");		
		
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i = 0; i<vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		int count = 0;
		System.out.println("NUMEROS PARES:");
		
		for (int i=0; i<vect.length;i++) {
			if (vect[i]%2==0) {
				System.out.print(vect[i] + " ");
				count ++;
			}
			
		}
		
		System.out.println();
		System.out.println();
		System.out.print("QUANTIDADE DE PARES = "+ count);
		
		sc.close();
	}
}
