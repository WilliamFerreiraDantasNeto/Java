package programa02_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class E5ValorAPagar {

	public static void main(String[] args) {
		/*Fazer um programa para ler o código de uma peça 1, 
		 * o número de peças 1, o valor unitário de cada peça 1, 
		 * o código de uma peça 2, o número de peças 2 e o valor 
		 * unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int code, qtd;
		double preco, total;
		
		code = sc.nextInt();
		qtd = sc.nextInt();
		preco = sc.nextDouble();
		total = preco*qtd;
		System.out.printf("Item 1 = código %d, quantidade %d, Valor R$ %.2f%n", code, qtd, preco*qtd);
		code = sc.nextInt();
		qtd = sc.nextInt();
		preco = sc.nextDouble();
		total += preco*qtd;
		System.out.printf("Item 2 = código %d, quantidade %d, Valor R$ %.2f%n", code, qtd, preco*qtd);
		System.out.printf("Valor a pagar: R$ %.2f", total);
		
		sc.close();
	}

}
