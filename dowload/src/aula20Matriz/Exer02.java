package aula20Matriz;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {
		int[][] numerosAleatorios = new int[10][10];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);

			}
		}
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		int maiorL5 = 0;
		int menorL5 = 100;
		int linhas5=5;
		for (int i = 0; i < numerosAleatorios[linhas5].length; i++) {
			if (numerosAleatorios[linhas5][i] > maiorL5) {
				maiorL5 = numerosAleatorios[linhas5][i];
			}
			if (numerosAleatorios[linhas5][i] < menorL5) {
				menorL5 = numerosAleatorios[linhas5][i];
			}
		}
		System.out.println();

		System.out.println("Maior valor da linha 5 : " + maiorL5);
		System.out.println("Menor valor da linha 5: " + menorL5);
		System.out.println();
		
		
		Object interge;
		int maiorC7=0;
		int menorC7=100;
		int colunas7=7;
		
		for (int i = 0; i < numerosAleatorios[colunas7].length; i++) {
			if (numerosAleatorios[i][colunas7] > maiorL5) {
				maiorC7 = numerosAleatorios[i][colunas7];
			}
			if (numerosAleatorios[i][colunas7] < menorC7) {
				menorC7 = numerosAleatorios[i][colunas7];
			}
		}
		System.out.println("Maior valor da coluna 7 : " + maiorC7);
		System.out.println("Menor valor da coluna 7: " + menorC7);
		System.out.println();
	}
}
