package aula16Loops;


import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("entre com o n ésimo termo de fibonacci");
		int n=scan.nextInt();
		int proximo;

		int primeiro=1;
		int segundo=1;
		System.out.println(primeiro);
		System.out.println(segundo);

		for ( int cont=3; cont<=n; cont++) {
			proximo = primeiro+ segundo;
			primeiro= segundo;
			segundo= proximo;
			
			System.out.println(proximo);
		}
	}

}
