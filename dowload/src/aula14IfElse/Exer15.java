package aula14IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite os tr�s lados do tri�ngulo ");
		double lado1=scan.nextDouble();
		double lado2=scan.nextDouble();
		double lado3=scan.nextDouble();
		
		if (((lado1+lado2>lado3) || (lado1+lado3>lado2) || (lado2+lado3>lado1))) {
			if (lado1==lado2 && lado1==lado3) {
				System.out.println("Tri�ngulo Equil�tero");			   
		     }
			else if (lado1!=lado2 && lado1!=lado3 && lado2!=lado3) {
		    	 System.out.println ("Tri�ngulo Escaleno");
		     }
			else if (lado1==lado2|| lado1==lado3 ||lado2==lado3) {
		    	 System.out.println("Tri�ngulo Is�celes");
			 }
	   }
		else {
			 System.out.println("N�o foumou um tri�ngulo");
			}
	
				   
		
	}
}