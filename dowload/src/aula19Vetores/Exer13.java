package aula19Vetores;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		
		
		int[] vetor = new int[10];
		int qtd=0;
		int soma=0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor da posi��o " + i);
			vetor[i] = scan.nextInt();
			
		
		     if(vetor[i] % 5 == 0) {
				  System.out.println(vetor[i]+ " � m�ltiplo de 5 ");
				  qtd++;
				  System.out.println();
				  soma +=vetor[i];
			  }		  

				System.out.println("M�ltiplos de 5: " +qtd);
				System.out.println("Soma dos m�ltiplos de 5: " +soma);	
  
		}

	}

}
