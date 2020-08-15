package aula14IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Nota 1");
		double nota1 = scan.nextDouble();
		System.out.println("Nota 2");
		double nota2 = scan.nextDouble();

		double media = (nota1 + nota2) / 2;
		String aproveitamento = "";

		if (media >= 9 && media <= 10) {
			aproveitamento = "A";
		} else if (media >= 7.5) {
			aproveitamento = "B";
		} else if (media >= 6) {
			aproveitamento = "C";
		} else if (media >= 4) {
			aproveitamento = "D";
		} else if (media >= 0) {
			aproveitamento = "E";
		}

		System.out.println("Nota 1 " + nota1);
		System.out.println("Nota 2 " + nota2);
		System.out.println("Média " + media);
		System.out.println("Conceito " + aproveitamento);

		switch (aproveitamento) {
		case "A":
		case "B":
		case "C":
			System.out.println("APROVADO");
			break;
		case "D":
		case "E":
			System.out.println("REPROVADO");
			break;
		default:
			System.out.println("Esta média não é válida");

		}
	}
}
