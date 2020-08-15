package aula19Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] resultados = new double[notas1.length];

		for (int i = 0; i < notas1.length; i++) {
			System.out.println("Digite a nota 1 do aluno" +(i+1));
			notas1[i] = scan.nextDouble();

			System.out.println("Digite a nota 2 do aluno" +(i+1));
			notas2[i] = scan.nextDouble();

			resultados[i] = (notas1[i] + notas2[i]) / 2;
		}

		System.out.print("Notas 1= ");
		for (int i = 0; i < notas1.length; i++) {
			System.out.print(notas1[i] + " ");
		}
		System.out.println();

		System.out.print("Notas 2= ");
		for (int i = 0; i < notas2.length; i++) {
			System.out.print(notas2[i] + " ");
		}
		System.out.println();
		
		System.out.println("Resultados= ");
		for (int i = 0; i < resultados.length; i++) {
			System.out.print(resultados[i] + " ");
			
			if (resultados[i]>=7) {
				System.out.println("-Aprovado ");
			} else {
				System.out.println("-Reprovado" );
			}
		}
		
		
	}
}