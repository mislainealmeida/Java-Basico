package aula16Loops;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
Scanner scan= new Scanner (System.in);
		
		System.out.println("Digite um número inteiro "); 
		int numero= scan.nextInt();
		int fatorial= 1;
		
		System.out.println("Fatorial de: " + numero);
		System.out.print(numero + "! = ");
		// 5*4*3*2*1=120
		
		for (int cont=numero; cont>1; cont--) {
			fatorial *= cont;
			System.out.print(cont + " * ");	
			
		}
		
		System.out.println(" 1 = "+ fatorial );
		
		
		

	}

}
