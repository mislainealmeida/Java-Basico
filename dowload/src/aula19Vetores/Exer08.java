package aula19Vetores;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
		
		int[] vetorA= new int[10];
		int[] vetorB= new int[vetorA.length];
		int[] vetorC= new int[vetorA.length];
		
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println(" Digite o valor do vetor A " +i);
			vetorA[i]= scan.nextInt();
			
		}
		
        for (int j=0; j<vetorA.length; j++) {
        	System.out.println("Digite o valor do vetor B "+j);
            vetorB[j]=scan.nextInt();
            
        }
        for (int k=0; k<vetorA.length; k++) {
        	vetorC[k]=vetorA[k]*vetorB[k];       	
        	
        }
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
        	 System.out.print(vetorA[i] +" ");
        }
        System.out.println();
        
        System.out.print("Vetor B = ");
        for (int j=0; j<vetorA.length; j++) {
        	 System.out.print(vetorB[j] +" ");
        }
        System.out.println();
        
        System.out.print("Vetor C = ");
        for (int k=0; k<vetorA.length; k++) {
       	 System.out.print(vetorC[k] +" ");
       }
        System.out.println();
	}

}
