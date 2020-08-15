package aula13Operadores;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
	
		 Scanner scan= new Scanner(System.in).useLocale(Locale.US); 
		 
		 System.out.println("Digite o tamanho em MB do arquivo para dowload ");
		 double tamanho=scan.nextDouble();
		 
		 System.out.println("Digite a velocidade em Mbps da internet ");
		 double velocidade=scan.nextDouble();

		 double tempo= tamanho/velocidade;
		 
		 System.out.println("O tempo para download é "+ tempo);
		 
		 
		 

	}

}
