package aula19Vetores;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
		
		
		
		int[] vetor = new int[10];
		int qtd=0;

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor da posi��o " + i);
			vetor[i] = scan.nextInt();
			
		
		     if(vetor[i] % 2 == 0) {
				  System.out.println(vetor[i]+ " � PAR ");
				  qtd++;
			  }		  
			  
		}
		
		System.out.println("A quantidade de vetores pares s�o: " +qtd);
			
	}

}
