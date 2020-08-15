package aula13Operadores;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in).useLocale(Locale.US); 
		 
		 System.out.println("Quanto você ganha por hora trabalhada? ");
		 double valorHora = scan.nextDouble();
		 
		 System.out.println("Quantas horas trabalhou este mês? ");
		 double horas = scan.nextDouble();
		 
		 double salarioBruto= valorHora * horas;
		 System.out.println ("Salário Bruto = "+salarioBruto);
		
		 double impostoRenda = 0.11*salarioBruto;
		 double inss= 0.08* salarioBruto;
		 double sindicato= 0.05*salarioBruto;
		 double salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
		 
		
		 System.out.println("Foi pago no  Imposto de Renda é R$ "+impostoRenda);
		 System.out.println("Foi pago no  INSS é R$ "+ inss);
		 System.out.println("Foi pago para o sindicato R$ "+sindicato);
		 System.out.println("O salário líquido foi R$ "+salarioLiquido);
		 
		 

	}

}
