package exemplosApplication;

import java.util.Locale;
import java.util.Scanner;

import exemplosEntities.Employee;

public class E4AumentoSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee x;
		x = new Employee();
		
		System.out.print("Name: ");
		x.setName(sc.nextLine());
		System.out.print("Gross salary: ");
		x.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		x.tax = sc.nextDouble();
		
		System.out.println(x);
		
		System.out.println("Which percentage to increase salary? ");
		double tax = sc.nextDouble();
		
		x.increaseSalary(tax);
		
		
		sc.close();
	}

}
