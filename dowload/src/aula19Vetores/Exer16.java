package aula19Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		int[] vetor = new int[10];
		int qtd15 = 0;
		int soma15 = 0;
		double media;
		int soma=0;
		int qtd=0;
		

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			vetor[i] = scan.nextInt();

			if (vetor[i] < 15) {
				soma15 += vetor[i];
				
			}
			else if (vetor[i]==15) {
				qtd15++;
				
			}
			else {
				soma+= vetor[i];
				qtd++;
				
			}

		}
		media=soma/qtd;
		System.out.println("A soma dos números inferiores a 15: " + soma15);
		System.out.println("A quantidade de números igual a 15: " + qtd15);
		System.out.println("A média de números superiores a 15: "+ media);

	}

}
