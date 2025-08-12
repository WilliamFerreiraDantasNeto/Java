package programa02_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Area_formas {

	public static void main(String[] args) {
		/*Fazer um programa que leia três valores com ponto flutuante de dupla 
		 * precisão: A, B e C. Em seguida, calcule e mostre:
		 * a) a área do triângulo retângulo que tem A por base e C por altura.
		 * b) a área do círculo de raio C. (pi = 3.14159)
		 * c) a área do trapézio que tem A e B por bases e C por altura.
		 * d) a área do quadrado que tem lado B.
		 * e) a área do retângulo que tem lados A e B.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b, c, area, pi = 3.14159;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		area = a*c/2;
		System.out.printf("Triangulo: %.3f%n", area);
		area = pi*Math.pow(c,2);
		System.out.printf("Circulo: %.3f%n", area);
		area = (a+b)*c/2;
		System.out.printf("Trapezio: %.3f%n", area);
		area = Math.pow(b,2);
		System.out.printf("Quadrado: %.3f%n", area);
		area = a*b;
		System.out.printf("Retangulo: %.3f%n", area);
		sc.close();
	}

}
