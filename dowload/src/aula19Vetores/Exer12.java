package aula19Vetores;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
           Scanner scan= new Scanner(System.in);
		
		
		
		int[] vetor = new int[10];
		int qtd=0;
		int soma=0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			vetor[i] = scan.nextInt();	
		    qtd++;		
		    soma +=vetor[i];
			  
		}
		
		System.out.println("A quantidade de vetores são: " +qtd);
		System.out.println("A soma dos vetores é: " +soma);
			

	}

}
