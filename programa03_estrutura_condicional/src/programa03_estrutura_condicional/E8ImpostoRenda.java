package programa03_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class E8ImpostoRenda {

	public static void main(String[] args) {
		/*Leia um valor com duas casas decimais, equivalente ao salário.
		 *  Em seguida, calcule e mostre o valor que esta pessoa deve 
		 *  pagar de Imposto de Renda.
		 */
		
		Locale.setDefault(Locale.US);
		double salario, imposto = 0;
		Scanner sc = new Scanner(System.in);
		salario = sc.nextDouble();
		
		if (salario > 4500) {
			imposto += (salario-4500) * 0.28;
			salario = 4500;
		}
		
		if (salario > 3000) {
			imposto += (salario-3000) * 0.18;
			salario = 3000;
		}
		
		if (salario > 2000) {
			imposto += (salario-2000) * 0.08;
		}
				
		if(imposto>0) {
			System.out.printf("R$ %.2f%n", imposto);
		}
		else {
			System.out.println("Isento");
		}
		
		sc.close();

	}

}
