package aula19Vetores;

import java.util.Scanner;

public class Exer35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um número inteiro " + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Analisando o número " + vetorA[i]);

			for (int j = 1; j < vetorA.length; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(j + " é divisor");

				}

			}

		}
	}
}