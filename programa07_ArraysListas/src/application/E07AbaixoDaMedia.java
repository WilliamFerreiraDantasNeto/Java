package application;

import java.util.Scanner;

public class E07AbaixoDaMedia {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos elementos vai ter o vetor? ");
		
		int n = sc.nextInt();
		double media=0;
		double[] vect = new double[n];
		
		for (int i = 0; i<vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
			media+=vect[i];
		}
		
		media/=vect.length;
		
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for (int i = 0; i<vect.length; i++) {
			if (vect[i]<media) {
				System.out.printf("%.1f%n",vect[i]);
			}
		}
		
		sc.close();
	}

}
