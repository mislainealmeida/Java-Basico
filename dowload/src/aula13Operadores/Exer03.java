package aula13Operadores;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Digite o primeiro n�mero inteiro: ");
		int numero= scan.nextInt();
		
		System.out.println("Digite o segundo n�mero inteiro: ");
		int numero2= scan.nextInt();
		
	
		int soma = numero + numero2;
		System.out.println("A soma dos n�meros �: " + soma);
		

	}

}
