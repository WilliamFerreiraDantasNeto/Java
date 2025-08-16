package exercicio2For;

import java.util.Scanner;

public class E5Fatorial {

	public static void main(String[] args) {
		/*Ler um valor N. Calcular e escrever seu respectivo fatorial. 
		 * Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		 * Lembrando que, por definição, fatorial de 0 é 1.*/

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), fatorial=1;
		
		for (int i = 1; i <= n ; i++ ) {
			fatorial*=i;
		}
		
		System.out.println(fatorial);
		
		
		sc.close();
	}

}
