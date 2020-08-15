package aula19Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		int[] vetor = new int[10];
		int qtdImpar=0;
		
		

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			vetor[i] = scan.nextInt();

			if (vetor[i] % 2 != 0) {
				qtdImpar++;
				
			}
		}
		int qtdPar = vetor.length - qtdImpar;
		double porcentagemPar = (qtdPar*100)/vetor.length;
		double porcentagemImpar = 100 - porcentagemPar;
		
		System.out.println(qtdImpar);
		System.out.println(qtdPar);
		System.out.println("Porcentagem Par: "+porcentagemPar);
		System.out.println("Porcentagem Impar: "+porcentagemImpar);

	}

}
