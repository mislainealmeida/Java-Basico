package aula14IfElse;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro ");
		int numero=scan.nextInt();
		
		if (numero % 2==0) {
			System.out.println( numero+" � PAR ");
		}else 
			System.out.println(numero +" � �MPAR");
	}

}
