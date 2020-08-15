package aula19Vetores;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in).useLocale(Locale.US);

		double[] vetorA= new double[10];
		double[] vetorB= new double[vetorA.length];
		double[] vetorC= new double[vetorA.length];
		
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println(" Digite o valor do vetor A " +i);
			vetorA[i]= scan.nextDouble();
			
		}
		
        for (int j=0; j<vetorA.length; j++) {
        	System.out.println("Digite o valor do vetor B "+j);
            vetorB[j]=scan.nextDouble();
            
        }
        for (int k=0; k<vetorA.length; k++) {
        	vetorC[k]=vetorA[k]/vetorB[k];       	
        	
        }
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
        	 System.out.print(vetorA[i] +" ");
        }
        System.out.println();
        
        System.out.print("Vetor B = ");
        for (int j=0; j<vetorA.length; j++) {
        	 System.out.print(vetorB[j] +" ");
        }
        System.out.println();
        
        DecimalFormat df= new DecimalFormat("###,###.#");
        
        
        System.out.print("Vetor C = ");
        for (int k=0; k<vetorA.length; k++) {
       	 System.out.print(vetorC[k] +" ");
       }
        System.out.println();

	}

}
