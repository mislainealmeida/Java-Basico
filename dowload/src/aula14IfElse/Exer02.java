package aula14IfElse;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		
		System.out.println("Digite um n�mero");
		int numero = scan.nextInt();
		
		if (numero>=0) {
			System.out.println(numero+ " � positivo");
		}
		else {
			System.out.println(numero + " � negativo");
		}
	}		

}
