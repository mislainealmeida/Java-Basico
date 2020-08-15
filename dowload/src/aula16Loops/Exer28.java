package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite um número inteiro ");
		int numero=scan.nextInt();
		boolean primo = true;
		
		for (int cont=2; cont<numero; cont++) {
			if (numero%cont==0) {
				System.out.println("O número "+ numero + " não é primo ");
				primo= false;
			}
		}
		if (primo) {
			System.out.println("O número "+ numero + " é primo ");
		}
	}
}