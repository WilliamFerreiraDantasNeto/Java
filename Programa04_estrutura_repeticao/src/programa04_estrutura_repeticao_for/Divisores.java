package programa04_estrutura_repeticao_for;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		//Ler um número inteiro N e calcular todos os seus divisores.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (n%i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
