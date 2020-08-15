package aula16Loops;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Digite um número inteiro "); 
		int numero= scan.nextInt();
		int fatorial= 1;
		
		// 5*4*3*2*1=120
		
		for (int cont=numero; cont>0; cont--) {
			fatorial *= cont;
			System.out.println(cont +" * " + fatorial);
			
			
		}
		
		System.out.println("Resultado "+ fatorial );
		
	
	}

}
