package aula13Operadores;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
    Scanner scan = new Scanner (System.in).useLocale(Locale.US); 
		
		System.out.println ("Qual a temperatura neste momento em Celsius? ");
		double celsius= scan.nextDouble();
		
		double farenheit= (celsius*1.8)+32;
		System.out.println("A temperatura de " + celsius + "C é igual a " + farenheit + "F");

	}

}
