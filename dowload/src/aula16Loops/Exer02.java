package aula16Loops;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        boolean infValida=false;
        String nome;
        String senha;
		
		do {	
			System.out.println("Nome do usuário: ");
			nome=scan.next();			
			System.out.println("Senha: ");		
			senha=scan.next();			

			if (nome.equalsIgnoreCase(senha)) {
				System.out.println("Sua senha não pode ser igual o seu nome, escolha outra senha. ");				
			} else {
			    infValida = true;
				System.out.println("Agora podemos prosseguir ");	
			}

		} while (!infValida);
	}

}
