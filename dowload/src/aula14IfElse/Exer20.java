package aula14IfElse;

import java.util.Scanner;


public class Exer20 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Responda sim ou n�o");
        System.out.println("Telefonou para a v�tima?");
        String resposta1=scan.next();
        System.out.println("Esteve no local do crime?");
        String resposta2=scan.next();
        System.out.println("Mora perta da v�tima?");
        String resposta3=scan.next();
        System.out.println("Devia para a v�tima?");
        String resposta4=scan.next();
        System.out.println("J� trabalhou para a v�tima?");
        String resposta5=scan.next();
        
        int cont=0;
        if(resposta1.equalsIgnoreCase("sim")) {
        	cont++;
        }
        if(resposta2.equalsIgnoreCase("sim")) {
        	cont++;
        }
        if(resposta3.equalsIgnoreCase("sim")) {
        	cont++;
        }
        if(resposta4.equalsIgnoreCase("sim")) {
        	cont++;
        }
        if(resposta5.equalsIgnoreCase("sim")) {
        	cont++;
        }
        if (cont==2) {
        	System.out.println("Suspeito");
        	
        }else if(cont==3|| cont==4) {
        	System.out.println("C�mplice");
        	
        }else if (cont==5) {
        	System.out.println("Assassino");
        	
        }else if(cont==0) {
        	System.out.println("Inocente");
        }
        
	}

}
