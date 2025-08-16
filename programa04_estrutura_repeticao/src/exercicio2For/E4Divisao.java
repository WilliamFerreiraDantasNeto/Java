package exercicio2For;

import java.util.Locale;
import java.util.Scanner;

public class E4Divisao {

	public static void main(String[] args) {
		/*ler um número N. Depois leia N pares de números e mostre a divisão
		 *  do primeiro pelo segundo. Se o denominador for igual a zero, mostrar 
		 *  a mensagem "divisao impossivel".*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), n1, n2;
		double divisao;
		
		for (int i = 0; i < n; i++) {
			n1 = sc.nextInt();
			n2 = sc.nextInt();
			if (n2 == 0) {
				System.out.println("Divisão impossivel");
			}
			else {
				divisao = n1/n2;
				System.out.println(divisao);
			}
		}
		
		
		sc.close();

	}

}
