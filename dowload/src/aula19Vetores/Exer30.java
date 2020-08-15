package aula19Vetores;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] pares = new int[vetorA.length];
		int[] impares = new int[vetorA.length];
		int posB=0;
		int posC=0;
		

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite Vetor A para a posição " + i);
			vetorA[i] = scan.nextInt();

			
			if( vetorA[i]%2==0) {
				pares[posB]=vetorA[i];
				posB++;
				
			}else {
				impares[posC]=vetorA[i];
				posC++;
				
			}

		}
		
		System.out.print("Vetor A  = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Números pares  = ");
		for (int i = 0; i < posB; i++) {
			System.out.print(pares[i] + " ");
		}
		System.out.println();

		System.out.print("Números ímpares  = ");
		for (int i = 0; i < posC; i++) {
			System.out.print(impares[i] + " ");

		}

	}

}
