package aula14IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite a primeira nota ");
		double nota1=scan.nextDouble();
		System.out.println("Digite a segunda nota ");
		double nota2=scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if (media ==10) {
			System.out.println ("Sua media foi " + media + " portanto esta Aprovado com Distinção");
					}
		else if (media>=7) {
			System.out.println ("Sua media foi " + media + " portanto esta Aprovado");
		}
		else {
			System.out.println ("Sua media foi " + media + " portanto esta Reprovado");
		}
		
	}

}
