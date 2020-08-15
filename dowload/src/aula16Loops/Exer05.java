package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Qual a população do país A? ");
		int popA = scan.nextInt();

		System.out.println("Qual a população do país B? ");
		int popB = scan.nextInt();

		System.out.println("Qual a taxa de crescimeto do país A? ");
		double taxaCrescA = scan.nextDouble();

		System.out.println("Qual a taxa de crescimeto do país B?");
		double taxaCrescB = scan.nextDouble();

		int cont = 0;
		while (popA < popB) {
			popA += (popA / 100) * taxaCrescA;
			popB += (popB / 100) * taxaCrescB;
			cont++;
		}
		System.out.println("Popualação A: " + popA);
		System.out.println("Popualação B: " + popB);
		System.out.println("Quantidade de anos para a população A ultrapassar a população B: " + cont);

	}

}
