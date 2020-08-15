package aula14IfElse;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
	System.out.println("Qual o seu sexo? [F/M]");
	    String letra = scan.next();
	 
	 if (letra.equalsIgnoreCase("f")){
		 System.out.println("Feminino");
	 }
	 else if (letra.equalsIgnoreCase("m")){
	     System.out.println("Masculino");
	 }
	 else {
		 System.out.println("Sexo inválido");
	 }
	 
	}

}
