package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in).useLocale(Locale.US); 

		System.out.println("Lojas Tabajara ");
		boolean sair = false;
		String continuarCompra;
		int qtdProduto;
		double precoProduto;
		double total = 0;
		String output;
		double valorPago;
		double troco;

		do {
			System.out.println("Deseja informar uma nova compra [S/N] ");
			continuarCompra = scan.next();

			if (continuarCompra.equalsIgnoreCase("s")) {

				output = "Lojas Tabajara\n ";

				System.out.println("Digite a quantidade de produtos da compra ");
				qtdProduto = scan.nextInt();

				for (int cont = 1; cont <= qtdProduto; cont++) {
					System.out.println("Informe o preço do produto " + cont);
					precoProduto = scan.nextDouble();
					total += precoProduto;
					output += "Produto" + cont + ": R$ " + precoProduto + "\n";

				}
				output += "Total R$ " + total+ "\n";

				System.out.println("Total R$ " + total);

				System.out.println("Entre com o valor pago ");
				valorPago = scan.nextDouble();

				output += "Dinheiro: R$ " + valorPago + "\n";
				troco = valorPago - total;
				output += "Troco: R$ " + troco;

				System.out.println(output);

			} else {
				sair = true;
			}
		} while (!sair);

	}

}
