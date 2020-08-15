package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		boolean infValida = false;

		do {
			System.out.println("Nome: ");
			nome = scan.next();
			if (nome.length() > 3) {
				infValida = true;
			} else {
				System.out.println("O nome precisa de mais de 3 caracteres");
			}
		} while (!infValida);

		infValida = false;
		do {
			System.out.println("Idade: ");
			idade = scan.nextInt();

			if (idade > 0 && idade < 150) {
				infValida = true;
			} else {
				System.out.println("A idade precisa ser maior que 0 e menor que 150 ");
			}
		} while (!infValida);

		
		infValida = false;
		do {
			System.out.println("Salário: ");
			salario = scan.nextDouble();
			
			if (salario > 0) {
				infValida = true;
			} else {
				System.out.println("O salário precisa ser maior que 0");
			}
		} while (!infValida);

		
		infValida = false;
		do {
			System.out.println("Sexo: ");
			sexo = scan.next();

			if (sexo.equalsIgnoreCase("feminino") || sexo.equalsIgnoreCase("masculino")) {
				infValida = true;
			} else {
				System.out.println("O sexo precisa ser feminino ou masculino");
			}
		} while (!infValida);

		
		infValida = false;
		do {
			System.out.println("Estado Civil: ");
			estadoCivil = scan.next();

			if (estadoCivil.equalsIgnoreCase("casado") || estadoCivil.equalsIgnoreCase("solteiro")
					|| estadoCivil.equalsIgnoreCase("viuvo") || estadoCivil.equalsIgnoreCase("divorciado")) {
				infValida = true;
			} else {
				System.out.println("O estado civil precisa ser casado, solteiro, viúvo ou divorciado");
			}

		} while (!infValida);
		
		System.out.println("As seguintes informações foram coletadas");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Salário:R$ "+salario);
		System.out.println("Sexo: "+sexo);
		System.out.println("Estado Civil: "+estadoCivil);
		
	}

}
