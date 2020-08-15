package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in).useLocale(Locale.US);
        
		System.out.println("Entre com a quantidade de Temperaturas ");
		int qtdTemperatura= scan.nextInt(); 
		
		double temperatura;
		double soma=0;
		double media;
		double maior=Double.MIN_VALUE;
		double menor= Double.MAX_VALUE;
		
		for (int cont=1; cont<= qtdTemperatura; cont ++) {
			System.out.println("Entre com  a Temperatura " + cont);
			temperatura=scan.nextDouble();
			
			soma +=temperatura;
			
			if (temperatura>maior) {
				maior= temperatura;
			}
			if (temperatura<menor){
				menor=temperatura; 
			}
			
		}
		
		media= soma/qtdTemperatura;
		System.out.println("A soma das temperaturas é igual a "+ soma);
		System.out.println("A média das temperaturas é igual a "+media);
		System.out.println("A maior temperatura é "+maior);
		System.out.println("A menor temperatura é "+menor);
	}

}
