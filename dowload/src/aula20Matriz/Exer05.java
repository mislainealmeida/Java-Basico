package aula20Matriz;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in).useLocale(Locale.US);

		String[][][] compromissos = new String[12][31][24];

		boolean sair = false;
		int opcao;

		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso");
			System.out.println("Digite 2 para para verificar ");
			System.out.println("Digite 0 para sair");
			opcao = scan.nextInt();

			if (opcao == 1) {// adicionar compromisso.

				int mes = 0;
				boolean mesValido = false;
				while (!mesValido) {
					System.out.println("Digite o mês ");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente ");
					}
				}
				int dia = 0;
				boolean diaValido = false;
				while (!diaValido) {
					System.out.println("Digite o dia do mês ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente ");
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
						System.out.println("Hora inválida, digite novamente ");
					}
				}
				mes--;
				dia--;
				System.out.println("Digite o compromisso ");
				compromissos[mes][dia][hora]= scan.next();
			} else if (opcao == 2) {// verificar compromisso.
				int mes = 0;
				boolean mesValido = false;
				while (!mesValido) {
					System.out.println("Digite o mês ");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente ");
					}
				}

				int dia = 0;
				boolean diaValido = false;
				while (!diaValido) {
					System.out.println("Digite o dia do mês ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente ");
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
						System.out.println("Hora inválida, digite novamente ");
					}
				}
				mes--;
				dia--;
				System.out.println("O compromisso agendado é:  ");
				System.out.println(compromissos[mes][dia][hora]);

			} else if (opcao == 0) {// sair
				sair = true;
			} else {
				System.out.println("Opção inválida ");
			}

		}
	}
}