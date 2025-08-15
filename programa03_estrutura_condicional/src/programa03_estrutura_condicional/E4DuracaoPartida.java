package programa03_estrutura_condicional;

import java.util.Scanner;

public class E4DuracaoPartida {

	public static void main(String[] args) {
		
		/* Leia a hora inicial e a hora final de um jogo. 
		 * A seguir calcule a duração do jogo, sabendo que 
		 * o mesmo pode começar em um dia e terminar em outro, 
		 * tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		int x, y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (y<=x ) {
			y+=24;
		}
		
		System.out.printf("O jodo durou %d hora(s)%n", y-x);
		
		sc.close();
	}

}
