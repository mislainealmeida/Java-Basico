package aula13Operadores;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
	
		Scanner scan= new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite a quantidade de metros ");
		double metros = scan.nextDouble();
		
		double cm= metros * 100;		
		System.out.println(metros +" m é igual a " + cm + "cm");

	}

}
