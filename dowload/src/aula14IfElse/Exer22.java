package aula14IfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in).useLocale(Locale.US);
     System.out.println("Digite quantidade de morangos em KG");
     double qtdMorango=scan.nextDouble();
     System.out.println("Digite quantidade de maçãs em KG");
     double qtdMaca=scan.nextDouble();
     
     double precoKgMorango=0;
     double precoKgMaca=0;
     
    if (qtdMorango<=5) {
    	precoKgMorango=2.5;
    }else {
    	precoKgMorango=2.2;
    }
    if (qtdMaca<=5) {
    	precoKgMaca=1.8;
    }else {
    	precoKgMaca=1.5;
    }
    
    double precoTotalMorango=qtdMorango*precoKgMorango;
    double precoTotalMaca=qtdMaca*precoKgMaca;
    double precoParcial=precoKgMorango+precoKgMaca;
    double precoTotal=precoParcial;
    
    
    if ((qtdMorango + qtdMaca>8)|| (precoParcial>25)){
    	precoTotal=precoParcial-((precoParcial/100)*10);
    }
    System.out.println("Preço Total = R$ "+precoTotal);
    
	}

}
