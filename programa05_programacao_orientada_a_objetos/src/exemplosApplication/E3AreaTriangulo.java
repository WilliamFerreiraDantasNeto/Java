package exemplosApplication;

import java.util.Locale;
import java.util.Scanner;

import exemplosEntities.Rectangle;

public class E3AreaTriangulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x;
		x = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		x.height = sc.nextDouble();
		x.width = sc.nextDouble();
		
		System.out.println(x);
		
		
		sc.close();
	}
}
