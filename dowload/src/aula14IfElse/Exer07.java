package aula14IfElse;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite tr�s n�meros inteiros");
		int numero1=scan.nextInt();
		int numero2=scan.nextInt();
		int numero3=scan.nextInt();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("O maior n�mero � : "+numero1);			
		}
		else if (numero2>= numero1 && numero2 >= numero3){
			System.out.println("O maior n�mero � : "+numero2);
		}
		else if(numero3>=numero1 && numero3>=numero2) {
			System.out.println("O maior n�mero � : "+numero3);
		}
		if (numero1 <= numero2 && numero1 <= numero3) {
			System.out.println("O menor n�mero � : "+numero1);			
		}
		else if (numero2<= numero1 && numero2 <= numero3){
			System.out.println("O menor n�mero � : "+numero2);
		}
		else if(numero3<=numero1 && numero3<=numero2) {
			System.out.println("O menor n�mero � : "+numero3);
		}
		

	}

}
