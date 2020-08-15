package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		int numero;
		int qtdPares = 0;
		int qtdImpares = 0;

		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Digite um número inteiro ");
			numero = scan.nextInt();
			if (numero % 2 == 0) {
				qtdPares++;

			} else {
				qtdImpares++;

			}

		}
		System.out.println("Há " + qtdPares + " números pares");
		System.out.println("Há " + qtdImpares + " números ímpares");

	}
}