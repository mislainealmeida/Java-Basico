package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Tabuada de  ");	
		int numero1=scan.nextInt();		
		int resultado; 
		
		
		
		
		for (int cont=1; cont<=10;  cont++) { 
			resultado= numero1*cont; 
			System.out.println(numero1+ " x "+ cont + " =" + resultado);
			 
		}
	}

}
