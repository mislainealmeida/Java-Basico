package aula16Loops;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade;
		int jovem = 0;
		int adulto = 0;
		int idoso = 0;

		System.out.println("Digite a quantidade de pessoas ");
		int pessoas = scan.nextInt();

		for (int cont = 1; cont <= pessoas; cont++) {
			System.out.println("Qual a sua idade? ");
			idade = scan.nextInt();

			if (idade > 0 && idade <= 25) {
				jovem++;
			} else if (idade > 26 && idade <= 60) {
				adulto++;
			} else {
				idoso++;
			}
			
		}
		System.out.println("Jovens: " + jovem);
		System.out.println("Adultos: " + adulto);
		System.out.println("Idosos " + idoso);

	}
}
