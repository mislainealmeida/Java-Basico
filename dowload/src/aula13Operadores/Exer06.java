package aula13Operadores;

import java.util.Locale;
import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o raio do círculo ");
		double raio= scan.nextDouble();
		
		
		double area= Math.PI * Math.pow (raio, 2);
		System.out.println("A área do círculo é: " + area);

	}

}
