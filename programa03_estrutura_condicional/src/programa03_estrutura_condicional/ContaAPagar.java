package programa03_estrutura_condicional;

import java.util.Scanner;

public class ContaAPagar {

	public static void main(String[] args) {
		
		/* Leia o código de um item e a quantidade deste item. 
		 * A seguir, calcule e mostre o valor da conta a pagar.
		*/
		
		int x, y;
		double z=0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x==1) {
			z = 4.0;
		}
		else if (x==2) {
			z = 4.5;
		}
		else if (x==3) {
			z = 5.0;
		}
		else if (x==4) {
			z = 2.0;
		}
		else if(x==5) {
			z = 1.5;
		}
		else {
			System.out.println("Opção invalida");
		}
		
		if (x>0 && x<6) {
			System.out.printf("Total: R$ %.2f%n", y*z);
			
		}
		
		sc.close();

	}

}
