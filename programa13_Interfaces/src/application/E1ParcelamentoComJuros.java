package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContracService;
import model.services.PaypalService;

public class E1ParcelamentoComJuros {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		ContracService contracService = new ContracService(new PaypalService());
		
		contracService.processContract(obj, n);
				
		System.out.println("Parcelas:");
		
		for(Installment installment : obj.getInstalmens()) {
			System.out.println(installment);
		}
		
		
		
		sc.close();
		/*
		25/07/2018 - 206.04
		25/08/2018 - 208.08
		25/09/2018 - 210.12
		*/

	}

}
