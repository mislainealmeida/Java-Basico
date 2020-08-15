package aula13Operadores;

import java.util.Locale;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in).useLocale(Locale.US); 
		
		System.out.println ("Qual a temperatura neste momento em Farenheit? ");
		double farenheit= scan.nextDouble();
		
		double celsius= (5*(farenheit-32)/9);
		System.out.println("A temperatura de " + farenheit + "F é igual a " + celsius + "C");

	}

}
