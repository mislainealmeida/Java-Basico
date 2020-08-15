package aula19Vetores;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
		
		
		
		int[] vetor = new int[10];
		

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um número para a posição " + i);
			vetor[i] = scan.nextInt();
			
		
		     if(vetor[i] % 2 != 0) {
				  System.out.println(vetor[i]+ " é IMPAR ");
				  break;
			  }		  
			  
		}
		
	}

}
