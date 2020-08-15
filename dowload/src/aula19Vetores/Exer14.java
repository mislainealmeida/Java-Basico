package aula19Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		int[] vetor = new int[10];
		int qtd = 0;
		int soma = 0;
		double media;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			vetor[i] = scan.nextInt();

			if (vetor[i] % 2 != 0) {
				System.out.println(vetor[i] + " é ÍMPAR ");
				qtd++;
				soma += vetor[i];
				System.out.println();
			}

		}
		media = soma / qtd;
		System.out.println("Soma: " + soma);
		System.out.println("Quantidade de ímpares: " + qtd);
		System.out.println("Média: " + media);
	}
}
