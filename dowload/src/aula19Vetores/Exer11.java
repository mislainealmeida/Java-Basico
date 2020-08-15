package aula19Vetores;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
		
		
		
		int[] vetor = new int[10];
		int qtd=0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor da posição " + i);
			vetor[i] = scan.nextInt();
			
		
		     if(vetor[i] % 2 == 0) {
				  System.out.println(vetor[i]+ " é PAR ");
				  qtd++;
			  }		  
			  
		}
		
		System.out.println("A quantidade de vetores pares são: " +qtd);
			
	}

}
