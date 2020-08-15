package aula14IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite os Litros vendidos");
		double litros=scan.nextDouble();
		System.out.println("Digite o tipo de combustível");
		String tipo =scan.next();
		
		double precoGasolina = 2.5;
		double precoAlcool = 1.9;
		int percDesconto= 0;
		double total=0;
		double totalDesc=0;
		
		
		if(tipo.equalsIgnoreCase("alcool")) {
			if (litros<=20) {
				percDesconto=3;
			}else {
				percDesconto=5;
			}
			total= litros*precoAlcool;
			
		}
		else if(tipo.equalsIgnoreCase("gasolina")) {
			if (litros<=20) {
				percDesconto=4;
			}else {
				percDesconto=6;
			}
			total= litros*precoGasolina;
	}
    totalDesc=(total/100)*percDesconto;
    double precoAPAgar= total- totalDesc;
    System.out.println("Valor a ser pago: R$ "+precoAPAgar);
  }
}
