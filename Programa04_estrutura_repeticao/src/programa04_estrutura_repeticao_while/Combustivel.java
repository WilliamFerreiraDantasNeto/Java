package programa04_estrutura_repeticao_while;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte
		 * forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido 
		 * (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
		 * O programa será encerrado quando o código informado for o número 4. Deve ser escrito 
		 * a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de 
		 * combustível, conforme exemplo.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), alcool = 0 , gasolina = 0, diesel = 0;
		
		while (x != 4) {
			switch (x){
				case 1:
					alcool += 1;
					break;
				case 2:
					gasolina += 1;
					break;
				case 3:
					diesel += 1;
					break;
				default:
					break;
			}
			x = sc.nextInt();			
		}
		System.out.println("Muito obrigado");
		System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%n", alcool, gasolina, diesel);
		
		sc.close();

	}

}
