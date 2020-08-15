package aula14IfElse;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		 System.out.println("Qual turno você estuda? [M/V/N]");
		 String turno = scan.next(); 
		 
		 /*if (turno.equalsIgnoreCase("m")) {
			 System.out.println("Bom Dia!");
		 }
		 else if (turno.equalsIgnoreCase("v")) {
			 System.out.println("Boa Tarde!");
		 }
		 else if (turno.equalsIgnoreCase("n")) {
			 System.out.println("Boa Noite!");
		 }
		 else {
			 System.out.println("Inválido");
		 }*/
		 
		 switch (turno) {
		 case"m":
		 case"M": System.out.println("Bom Dia!");break;
		 case"v":
		 case"V": System.out.println("Boa Tarde!");break;
		 case"n":
		 case"N": System.out.println("Boa Noite!");break;
		 default: System.out.println("Inválido");break;
		 
		 }
		 
	}

}
