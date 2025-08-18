package application;

import java.util.Scanner;

public class E08MediaPares {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor? ");		
		
		int n = sc.nextInt(), count=0;
		double media=0;
		int[] vect = new int[n];
		
		for (int i = 0; i<vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
			if (vect[i]%2==0) {
				media+=vect[i];
				count++;
			}
		}
		
		if(count>0) {
			System.out.printf("Media dos pares = %.1f", media/count);
		}
		else {
			System.out.println("Nenhum numero par");
		}
		
		sc.close();
	}
}
