package aula16Loops;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro ");
		int numero = scan.nextInt();
		boolean primo;
		

		for (int cont = 1; cont <= numero; cont++) {
			 primo = true;

			for (int i = 2; i <cont; i++) {
				if (cont % i == 0)  {
					primo = false;

				}

			}
			if (primo=true) {
				System.out.println(cont);				
			}

		}

	}
}
