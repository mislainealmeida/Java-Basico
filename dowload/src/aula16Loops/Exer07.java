package aula16Loops;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero;
		int maior = Integer.MIN_VALUE;

		for (int cont = 0; cont < 5; cont++) {
			System.out.println("Informe 5 n�meros inteiros ");
			numero = scan.nextInt();
			if (numero > maior) {
				maior = numero;
			}
			System.out.println("O maior n�mero digitado foi: " + maior);

		}

	}
}
