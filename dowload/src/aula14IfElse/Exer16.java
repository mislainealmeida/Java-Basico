package aula14IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite os valores de A, B e C respectivamente");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double delta = (b * b) - (4 * a * c);
		if (a == 0) {
			System.out.println("Digite um valor diferente de zero para A");
		} else {
			
			if (delta < 0) {
				System.out.println("Não existe raíz real");
			    
			} else {
				if (delta == 0) {
					System.out.println("Existe uma raíz real");
				} else {
					System.out.println("Existem duas raízes reais");
				}
				double x1 = -b + Math.sqrt( delta );
				double x2 = b + Math.sqrt( delta );

				System.out.println("X1 = " + x1 + " X2 = " + x2);
			}
			
		}
		
		

	}

}
