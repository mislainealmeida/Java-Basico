package aula13Operadores;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in).useLocale(Locale.US); 
		 
		 System.out.println("Digite dois n�meros inteiros ");
		 int numero1= scan.nextInt();
		 int numero2= scan.nextInt();
		 
		 System.out.println("Digite um n�mero real ");
		 double numero3= scan.nextDouble();
		 
		 int produto= (2*numero1)*(numero2/2);
		 double soma= (3*numero1)+ (numero3);
		 double cubo=  Math.pow (numero3,3);
		 System.out.println("O produto do dobro do primeiro com a metade do segundo � igual a  "+ produto);
		 System.out.println("O triplo do primeiro somado com o terceiro � igual a "+ soma);
		 System.out.println("O terceiro ao cubo � igual a "+ cubo); 
	}

}
