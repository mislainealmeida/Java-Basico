package aula20Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		String[][] compromissos = new String[31][24];

		boolean sair = false;
		int opcao;

		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para para verificar ");
			System.out.println("Digite 0 para sair");
			opcao = scan.nextInt();

			if (opcao == 1) {// adicionar compromisso.
				int dia = 0;
				boolean diaValido = false;
				while (!diaValido) {
					System.out.println("Digite o dia do m�s ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente ");
					}
				}
				int hora = 0;
				boolean horaValida = false;
				while (!horaValida) {
					System.out.println("Digite a hora do compromisso ");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inv�lida, digite novamente ");
					}
				}
				dia--;
				System.out.println("Digite o compromisso ");
				compromissos[dia][hora] = scan.next();

			} else if (opcao == 2) {// verificar compromisso.

				int dia = 0;
				boolean diaValido = false;
				while (!diaValido) {
					System.out.println("Digite o dia do m�s ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente ");
					}
				}
				int hora = 0;
				boolean horaValida = false;
				while (!horaValida) {
					System.out.println("Digite a hora do compromisso ");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inv�lida, digite novamente ");
					}
				}
				dia--;
				System.out.println("O compromisso agendado �:  ");
				System.out.println(compromissos[dia][hora]);

			} else if (opcao == 0) {// sair
				sair = true;
			} else {
				System.out.println("Op��o inv�lida ");
			}

		}
	}
}