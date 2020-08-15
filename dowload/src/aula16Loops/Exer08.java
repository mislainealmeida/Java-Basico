package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in).useLocale(Locale.US);

			int numero;
			int soma=0;
			double media;

			for (int cont = 0; cont < 5; cont++) {
				System.out.println("Informe um números inteiros ");
				numero = scan.nextInt();
				soma +=numero;				
			}
			media= soma/5;
			
			System.out.println(" A soma é "+ soma);
			System.out.println(" A média é "+ media);
	}

}
