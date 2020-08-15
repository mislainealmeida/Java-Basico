package aula19Vetores;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetor = new int[10];
		
		

		for (int i = 0; i<vetor.length; i++) {
			System.out.println("Digite um número para a posição " + i);
			      vetor[i] = scan.nextInt();
		}
		
		boolean palin = true;
		for (int i = 0; i<(vetor.length)/2; i++) {
			      
			if (vetor[i] != vetor[vetor.length -1 -i]) {
				palin= false;
				break;									
			}

		}
		
		System.out.print("Vetor  = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		
		if (palin) {
			System.out.println("Palindromo ");
		}else{
			System.out.println("Não é palindromo ");
		}

	}
}
