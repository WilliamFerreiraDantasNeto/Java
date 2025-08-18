package application;

import java.util.Scanner;

public class E06SomaVetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos valores vai ter cada vetor? ");		
		
		int n = sc.nextInt();
		int[] vectA = new int[n], vectB = new int[n], vectC = new int[n];
		
		for (int i = 0; i<vectA.length; i++) {
			System.out.println("Digite os valores do vetor A: ");
			vectA[i] = sc.nextInt();
		}
		for (int i = 0; i<vectB.length; i++) {
			System.out.println("Digite os valores do vetor B: ");
			vectB[i] = sc.nextInt();
		}
		for (int i = 0; i<vectC.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("VETOR RESULTANTE:");
		for (int i = 0; i<vectC.length; i++) {
			System.out.println(vectC[i]);
		}
		
		sc.close();
	}

}
