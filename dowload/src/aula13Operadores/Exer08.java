package aula13Operadores;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		    Scanner scan = new Scanner (System.in).useLocale(Locale.US); 
			System.out.println("Quanto você ganha por hora? ");
			double salario = scan.nextDouble();
			
			System.out.println("Quantas horas você trabalhou no mês? ");
			double horas = scan.nextDouble();
			
			double salarioFinal= salario*horas;
			System.out.println("Você receberá este mês:R$ "+ salarioFinal);
		}
	}	
		
        