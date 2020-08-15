package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in).useLocale(Locale.US);

	System.out.println("Digite a base e o expoente respectivamente");
	double base=scan.nextDouble();
	int expoente=scan.nextInt();
	double resultado=base;
	
	for (int cont=1; cont < expoente; cont++) {
	     resultado *=base;    
	     
	}System.out.println(base + " ^ " + expoente + " = "+ resultado);

	
	}
	

}
