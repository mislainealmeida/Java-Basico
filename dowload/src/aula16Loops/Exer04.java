package aula16Loops;



public class Exer04 {

	public static void main(String[] args) {
		
		
		
		int popA=80000;
		int popB=200000;
		int cont=0; 
		
		
		while (popA<popB) {
			popA +=(popA/100)*3;
			popB +=(popB/100)*1.5;
			cont++;
		}
		System.out.println("Popualação A: "+popA);
		System.out.println("Popualação B: "+popB);
		System.out.println("Quantidade de anos para a população A ultrapassar a população B: "+cont);
		
		
	}

}
