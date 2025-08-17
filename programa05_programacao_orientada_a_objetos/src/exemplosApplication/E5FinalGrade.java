package exemplosApplication;

import java.util.Locale;
import java.util.Scanner;

import exemplosEntities.Student;

public class E5FinalGrade {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.name = sc.nextLine();
		student.grade1 = sc.nextDouble();
		student.grade2 = sc.nextDouble();
		student.grade3 = sc.nextDouble();
		
		System.out.printf("Final grade: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60) {
			System.out.println("Failed");
			System.out.printf("Missing %.2f%n", student.missingPoints());
		}
		else {
			System.out.println("Pass");
		}
		
		sc.close();

	}

}
