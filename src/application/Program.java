package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("ENter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <=n; i++) {
			System.out.println("Tax payer #"+i+" data: ");
			System.out.print("Individual or Company (i/c)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			
			if(resp == 'i') {
				System.out.print("Health expedure: ");
				double healthExpendure = sc.nextDouble();
				
				list.add(new Individual(name, anualIncome, healthExpendure));
			}
			else {
				System.out.print("Number of employees? ");
				int numberOfEmployess = sc.nextInt();
				
				list.add(new Company(name, anualIncome, numberOfEmployess));
			}
			
		}
		
		System.out.println();
		System.out.println("Taxes Paid: ");
		
		for(TaxPayer payer : list) {
			System.out.printf("%s: $ %.2f \n", payer.getName(), payer.tax() );
		}
		
		double sum = 0.0;
		
		for(TaxPayer payer : list) {
			sum += payer.tax();
		}
		
		System.out.println();
		System.out.printf("Total Taxs: %.2f", sum);
		
		sc.close();

	}

}
