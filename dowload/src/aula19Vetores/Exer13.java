package aula19Vetores;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		
		
		int[] vetor = new int[10];
		int qtd=0;
		int soma=0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			vetor[i] = scan.nextInt();
			
		
		     if(vetor[i] % 5 == 0) {
				  System.out.println(vetor[i]+ " é múltiplo de 5 ");
				  qtd++;
				  System.out.println();
				  soma +=vetor[i];
			  }		  

				System.out.println("Múltiplos de 5: " +qtd);
				System.out.println("Soma dos múltiplos de 5: " +soma);	
  
		}

	}

}
