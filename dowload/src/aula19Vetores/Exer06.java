package aula19Vetores;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int[] vetorA= new int[10];
		int[] vetorB= new int [vetorA.length];
		int[] vetorC= new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++){			
			System.out.println ("Digite o valor do vetor A na posição: " + i);
			  vetorA[i]=scan.nextInt();			   
		}
		
	    for (int i=0; i<vetorB.length; i++){			
			System.out.println ("Digite o valor do vetor B na posição: " + i);
			vetorB[i]=scan.nextInt();			   
		} 
	    
        for (int i=0; i<vetorB.length; i++){		
			
			  vetorC[i]=vetorA[i]+vetorB[i];
			  System.out.println ("Vetor C " + vetorC[i]);
		} 
        
		

	}

}
