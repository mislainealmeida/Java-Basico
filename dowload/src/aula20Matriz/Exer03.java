package aula20Matriz;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] numeros = new int[3][3];
		int qtdPares = 0;
		int qtdImpares = 0;

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {

				System.out.println("Digite um número para a posição " + i + " , " + j);
				numeros[i][j] = scan.nextInt();
			}
		}
		

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros.length; j++) {

				if (numeros[i][j] % 2 == 0) {
					qtdPares++;

				} else {
					qtdImpares++;
				}

			}

		}
		for (int i=0; i<numeros.length; i++) {
			for(int j=0; j<numeros.length; j++) {
				System.out.print(numeros[i][j]+ " ");			
				
			}
			System.out.println();
		}
		System.out.println("Números Pares: "+qtdPares);
		System.out.println("Números Ímpares: "+qtdImpares);
	}
}
