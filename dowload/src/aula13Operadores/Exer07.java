package aula13Operadores;

import java.util.Locale;
import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in).useLocale(Locale.US);
		
		System.out.println("Digite o lado do quadrado ");
		double lado = scan.nextDouble();
		
		double area = Math.pow (lado,2);
		
		System.out.println ("A �rea do quadrado � "+ area);
		System.out.println ("O dobro da �rea do quadrado � "+ (area*2));
		

	}

}
