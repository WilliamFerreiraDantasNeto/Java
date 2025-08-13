package programa04_estrutura_repeticao_for;

import java.util.Locale;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a 
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com 
		 * uma casa decimal. Apresente a média ponderada para cada um destes conjuntos 
		 * de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 
		 * 3 e o terceiro valor tem peso 5.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double n1, n2, n3, media = 0;
		
		for (int i = 0; i < x; i++) {
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			media = (n1*2+n2*3+n3*5)/10;
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
	}

}
