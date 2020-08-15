package aula19Vetores;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetor = new int[10];
		
		
		

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite a idade da pessoa " + (i+1));
			vetor[i] = scan.nextInt();
		}
		
		int maior = vetor [0];
		int posicaoMaior=0;
		int menor = vetor[0];
		int posicaoMenor=0;
		for (int i = 1; i < vetor.length; i++) {
				
			if (vetor[i] >maior) {
				maior=vetor[i];
				posicaoMaior=i;
				
			}
			else if (vetor[i]< menor) {
				menor=vetor[i];
				posicaoMenor=i;
			}
		}
		
		System.out.println("Vetor de idades = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]+ " "); 
		}
		System.out.println("Maior idade " + maior + " na posição "+posicaoMaior);
		System.out.println("Menor idade " + menor + " na posição "+posicaoMenor);

	}

}
