package aula14IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in).useLocale(Locale.US);
		 
		 System.out.println("Qual o seu salário? ");
		 double salario=scan.nextDouble();
		 
		 int percentual=0;
		 if (salario <=280) {
			 percentual= 20;
			}
		 else if (salario > 280 && salario <=700) {
			 percentual=15;			 
			}
		 else if (salario >700 && salario <=1500) {
			 percentual=10;			 
			}
		 else {
			 percentual=5;
			}
		 
		double aumento= (salario/100)*percentual;
		double novoSalario= salario + aumento;
		 
		 System.out.println("O salário anterior era R$ "+salario);
		 System.out.println("O aumento foi de "+percentual +"%");
		 System.out.println("O aumento foi de R$ "+aumento);
		 System.out.println("O novo salário é R$ "+novoSalario);
	}

}
