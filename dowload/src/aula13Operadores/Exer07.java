package aula13Operadores;

import java.util.Locale;
import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in).useLocale(Locale.US);
		
		System.out.println("Digite o lado do quadrado ");
		double lado = scan.nextDouble();
		
		double area = Math.pow (lado,2);
		
		System.out.println ("A área do quadrado é "+ area);
		System.out.println ("O dobro da área do quadrado é "+ (area*2));
		

	}

}
