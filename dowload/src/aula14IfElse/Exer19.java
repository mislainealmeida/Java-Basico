package aula14IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exer19 {

	

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Digite dois números");
		int numero1=scan.nextInt();
		int numero2=scan.nextInt();
			
		
		System.out.println("Entre com a operaçao [+ - * /]: ");
		String operacao=scan.next();
		double resultado=0;
		boolean valida= true;
		
		switch(operacao) {
		    case "+":resultado= numero1 +numero2; 
		         break;
		    case "-":resultado= numero1 -numero2; 
                 break;
		    case "*":resultado= numero1 *numero2; 
                 break;
		    case "/":resultado= numero1 /numero2; 
                  break;
            default: System.out.println("Operação inválida");
                  valida= false;
		}
        if (valida) {
          if (resultado >=0)	{
        	  System.out.println ("Reultado positivo");
          } else {
        	  System.out.println("Resultado negativo");
          }
        }
		if (resultado % 2==0) {
			System.out.println(" Resultado PAR ");
		}else 
			System.out.println("Resultado é ÍMPAR");
	}

}
