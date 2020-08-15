package aula14IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Entre com o tipo da carne ");
		System.out.println("1- file duplo ");
		System.out.println("2- alcatra ");
		System.out.println("3- picanha ");
		int tipo = scan.nextInt();

		System.out.println("Entre com a quantidade em Kg de carne ");
		double qtdCarne = scan.nextDouble();
		double preco = 0;

		if (tipo == 1) {
			System.out.println(qtdCarne + "Kg - filé duplo");
			if (qtdCarne < 5) {
				preco = 4.9;
			} else {
				preco = 5.8;
			}
		} else if (tipo == 2) {
			System.out.println(qtdCarne + "Kg - alcatra");
			if (qtdCarne < 5) {
				preco = 5.9;
			} else {
				preco = 6.8;
			}
		} else {
			System.out.println(qtdCarne + "Kg - picanha");
			if (qtdCarne < 5) {
				preco = 6.9;
			} else {
				preco = 7.8;
			}

		}
		
		double total = qtdCarne*preco;
		System.out.println(qtdCarne + "Kg * " + preco + " = R$ " +total);
		System.out.println("Compra no cartão? digite 1 para sim");
		int cartao=scan.nextInt();
		
		if(cartao==1) {
			double desconto=(total/100)*5;
			System.out.println("Desconto de: R$" + desconto);
			System.out.println("Valor a pagar: R$ "+(total-desconto));
			
		}else {
			System.out.println("Valor a pagar: R$ "+total);
			
		}
	}
}