package aula16Loops;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Tabuada de  ");
		int numero = scan.nextInt();

		int resultado;
		int inicial;
		int fim;
		boolean invalido = true;
		boolean finalizado = true;

		do {
			System.out.println("Tabuada deve iniciar em:  ");
			inicial = scan.nextInt();
			System.out.println("Tabuada deve finalizar em:  ");
			fim = scan.nextInt();

			if (fim < inicial) {
				System.out.println("Não é válido");
				invalido = false;
				finalizado = false;

			} else {
				finalizado = true;
				for (int cont = inicial; cont <= fim; cont++) {
					resultado = numero * cont;
					System.out.println(numero + " x " + cont + " =" + resultado);
				}
			}
		} while (!invalido && !finalizado);

		System.out.println("Tabuada de:  " + numero);
		System.out.println("Começar por:  " + inicial);
		System.out.println("Terminar por:  " + fim);
		System.out.println();

	}
}
