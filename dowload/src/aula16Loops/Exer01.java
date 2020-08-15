package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in).useLocale(Locale.US);
		
		boolean notaValida = false;
		do {
			System.out.println("Digite a nota entre 0 e 10. ");
			double nota=scan.nextDouble();
			
			if (nota>=0 && nota<=10) {
				System.out.println("Você digitou: "+nota);
				notaValida=true;
				
			}else {
				System.out.println("Nota inválida, digite outro valor ");
			}
		}while (!notaValida);
		
	}
	
}	