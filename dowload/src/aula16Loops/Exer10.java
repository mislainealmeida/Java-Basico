package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite dois número ");
		int numero1=scan.nextInt();
		int numero2=scan.nextInt();
		
		for (int cont=numero1; cont<=numero2;  cont++) {
			 System.out.println(cont);
		}
		
		
	}

}
