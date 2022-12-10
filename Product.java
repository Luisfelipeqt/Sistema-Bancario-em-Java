package Program;

import java.util.Locale;
import java.util.Scanner;
import Entities.Banco;
import curso_programacao.Produto;

public class Product {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Banco contaOne1;
		System.out.print("Enter account number: ");
		int conta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			 contaOne1 = new Banco(conta, name, initialDeposit);
		} else {
			 contaOne1 = new Banco(conta, name);

		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(contaOne1);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		contaOne1.depositoConta(depositValue);
		System.out.println("Updated account data:");
		System.out.println(contaOne1);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		contaOne1.saqueConta(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(contaOne1);
		sc.close();
	}

}
