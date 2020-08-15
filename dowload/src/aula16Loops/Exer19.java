package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Qual a quantidade de bimestres? ");
		int bimestres=scan.nextInt();
		
		double soma=0;
		double media;
		double nota;	   
		
		
		for (int cont=1; cont<=bimestres; cont++) {
			System.out.println("Nota " +cont);			
			nota=scan.nextDouble();
			soma +=nota;
			
		}
		media= soma/bimestres;
		
		System.out.println("Soma: " +soma);
		System.out.println("Média: " +media);
		

	}

}
