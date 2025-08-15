package programa03_estrutura_condicional;

import java.util.Scanner;

public class E3Multiplos {

	public static void main(String[] args) {
		
		/*Leia 2 valores inteiros (A e B). Após, o programa 
		 * deve mostrar uma mensagem "Sao Multiplos" ou "Nao 
		 * sao Multiplos", indicando se os valores lidos são 
		 * múltiplos entre si.
		 * Atenção: os números devem poder ser digitados em
		 * ordem crescente ou decrescente.
		 */
		
		int x, y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (y%x == 0 || x%y ==0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplios");
		}
		
		sc.close();

	}

}
