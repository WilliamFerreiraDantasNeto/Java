package programa03_estrutura_condicional;

import java.util.Scanner;

public class Negativo {

	public static void main(String[] args) {
		
		//ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		int x;
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		if(x<0) {
			System.out.println("Negativo");
		}
		else {
			System.out.println("Não negativo");
		}
		sc.close();

	}

}
