package aula19Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		double[] vetorA = new double[20];
		double cotacao;

		System.out.println("Digite a cotação do dollar ");
		cotacao = scan.nextDouble();

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i + 1);

		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

	}
}
