package programa02_estrutura_sequencial;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		/*Faça um programa para ler dois valores inteiros, 
		 * e depois mostrar na tela a soma desses números 
		 * com uma mensagem.
		 */
		Scanner sc = new Scanner(System.in);
		int a, b, soma;
		
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		System.out.println("Soma = " + soma);
		
		sc.close();

	}

}
