package aula19Vetores;

import java.util.Scanner;
import java.util.Locale;


public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		int[] vetorA = new int [10];
		int qtd=0;
		int qtd1=0;
		
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] =(int)Math.round(Math.random() * 1);
			if(vetorA[i]==0) {
				qtd++;
			}else {
				qtd1++;
			}
		}
		double porcentagem= (qtd*100)/vetorA.length;
		double porcentagem1= (qtd1*100)/vetorA.length;
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("Porcentagem "+porcentagem);
		System.out.println("Porcentagem 1 "+porcentagem1);
	} 
	
}
