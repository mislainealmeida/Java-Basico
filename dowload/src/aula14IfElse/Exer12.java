package aula14IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in).useLocale(Locale.US);

		 System.out.println("Quanto você ganha por hora trabalhada? ");
		 double valorHora = scan.nextDouble();
		 
		 System.out.println("Quantas horas trabalhou este mês? ");
		 double horas = scan.nextDouble();
		 
	    double salarioBruto= valorHora*horas;
	    int percentualIR=0;
	    if (salarioBruto<=900) {
	    	percentualIR=0;	    	
	    }
	    else if (salarioBruto> 900 && salarioBruto<=1500) {
	    	percentualIR=5;	    	
	    }
	    else if (salarioBruto> 1500 && salarioBruto<2500) {
	    	percentualIR=10;	    	
	    }
	    else {
	    	percentualIR=20;
	    }
	    
	    double ir= (salarioBruto/100)*percentualIR;
	    double inss= (salarioBruto/100)*10;
	    double fgts = (salarioBruto/100)*11;
	    double totalDesconto = ir+inss;
	    double salarioLiquido= salarioBruto-totalDesconto;
	    
	    System.out.println ("Salário Bruto: R$ "+salarioBruto);
	    System.out.println ("IR: R$ "+ir);
	    System.out.println ("INSS: R$ "+inss);
	    System.out.println ("FGTS: R$ "+fgts);
	    System.out.println ("Total de descontos: R$ "+totalDesconto);
	    System.out.println ("Salário Liquido: R$ "+salarioLiquido);
	}

}
