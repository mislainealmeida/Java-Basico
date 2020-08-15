package aula19Vetores;
import java.util.Scanner;

public class Exer34 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		int[] vetorA= new int[10];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Digite um número inteiro "+i);
			 vetorA[i]= scan.nextInt();
			 if (i%2==0) {
				 System.out.println(i + " é Par");
				 }else {
					 System.out.println(i + " é Ímpar");
				 }
			 System.out.println();
			 }
		}
	}