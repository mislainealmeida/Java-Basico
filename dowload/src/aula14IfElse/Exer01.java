package aula14IfElse;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite dois n�meros ");
		int numero1 = scan.nextInt();
		int numero2 = scan.nextInt();
		
		if (numero1>numero2)
			System.out.println (numero1 +" � maior que " +numero2);
		else 
			System.out.println(numero2+ " � maior que "+ numero1);
	}

}
