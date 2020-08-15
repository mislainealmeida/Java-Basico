package aula16Loops;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int qtdAlunos;
		int soma = 0;
		int media;
		boolean invalido = true;

		System.out.println("Quantidade de turmas na escola ");
		int qtdTurmas = scan.nextInt();

		for (int cont = 1; cont <=qtdTurmas; cont++) {

			do {
				System.out.println("Quantidade de alunos da turma " + cont);
				qtdAlunos = scan.nextInt();
				if (qtdAlunos <= 40) {
					invalido = false;
				} else {
					System.out.println("Número de alunos inválidos, digite novamente");
				}
			} while (invalido);
            
			soma +=qtdAlunos;			
			
		}
		media= soma/qtdTurmas;
		System.out.println("Média: " + media);

	}

}
