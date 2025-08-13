package programa04_estrutura_repeticao_for;

import java.util.Scanner;

public class PotenciaCubica {

	public static void main(String[] args) {
		/*ler um número inteiro positivo N. O programa deve então mostrar 
		 * na tela N linhas, começando de 1 até N. Para cada linha, mostrar 
		 * o número da linha, depois o quadrado e o cubo do valor
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d%n",i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));
		}
		
		sc.close();

	}

}
