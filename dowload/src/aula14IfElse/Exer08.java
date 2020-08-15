package aula14IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {
	public static void main(String[] args) {


		Scanner scan = new Scanner (System.in).useLocale(Locale.US);

		System.out.println("Digite o preço dos três produtos");
		double preco1=scan.nextDouble();
		double preco2=scan.nextDouble();
		double preco3=scan.nextDouble();
		
       if (preco1<=preco2 && preco1<=preco3) {
    	   System.out.println("O produto 1 é mais barato");
       }
       else if (preco2<=preco1 && preco2<=preco3) {
    	   System.out.println("O produto 2 é mais barato");
       }
       else {
    	   System.out.println("O produto 3 é mais barato");
       }
	}
}