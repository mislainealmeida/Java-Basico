package aula13Operadores;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		    Scanner scan = new Scanner (System.in).useLocale(Locale.US); 
			System.out.println("Quanto voc� ganha por hora? ");
			double salario = scan.nextDouble();
			
			System.out.println("Quantas horas voc� trabalhou no m�s? ");
			double horas = scan.nextDouble();
			
			double salarioFinal= salario*horas;
			System.out.println("Voc� receber� este m�s:R$ "+ salarioFinal);
		}
	}	
		
        