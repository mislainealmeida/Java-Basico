package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
         Scanner scan= new Scanner (System.in).useLocale(Locale.US); 
		
		System.out.println("Quantidade de CD: ");
		int qtdCd= scan.nextInt();
		
		double valorTotal=0;
		double valorMedio;
		
		for (int cont=1; cont<=qtdCd; cont++) {
			System.out.println("Valor do CD " + cont + " : R$ ");
			double valorCd=scan.nextDouble();
			valorTotal +=valorCd;
		}
		
		valorMedio= valorTotal/qtdCd;
		System.out.println("Valor Médio de cada CD:R$ "+valorMedio);
		System.out.println("Valor Total gasto com "+ qtdCd + " CDs : R$ " +valorTotal);

	}

}
