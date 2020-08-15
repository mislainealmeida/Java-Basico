package aula14IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite os três lados do triângulo ");
		double lado1=scan.nextDouble();
		double lado2=scan.nextDouble();
		double lado3=scan.nextDouble();
		
		if (((lado1+lado2>lado3) || (lado1+lado3>lado2) || (lado2+lado3>lado1))) {
			if (lado1==lado2 && lado1==lado3) {
				System.out.println("Triângulo Equilátero");			   
		     }
			else if (lado1!=lado2 && lado1!=lado3 && lado2!=lado3) {
		    	 System.out.println ("Triângulo Escaleno");
		     }
			else if (lado1==lado2|| lado1==lado3 ||lado2==lado3) {
		    	 System.out.println("Triângulo Isóceles");
			 }
	   }
		else {
			 System.out.println("Não foumou um triângulo");
			}
	
				   
		
	}
}