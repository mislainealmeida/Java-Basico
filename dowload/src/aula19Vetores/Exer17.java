package aula19Vetores;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetor = new int[10];
		int qtd = 0;
		
		

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a idade da pessoa" + (i+1));
			vetor[i] = scan.nextInt();

			if (vetor[i] >35) {
				qtd ++;
				
			}
		}
		
		System.out.println("Pessoas a cima de 35 anos de idade: " + qtd);
		
	}

}
