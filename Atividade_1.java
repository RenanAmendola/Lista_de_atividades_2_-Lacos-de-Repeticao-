
public class Atividade_1 {

	public static void main(String[] args) {
	
	
	/*Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)	*/
				
	double x, resultado;	
		
		System.out.println("Esses s�o os numeros que dividindo por 11 restar�o 5");
		
		for(x = 1000; x >= 1000 && x <= 1999; x++) {
			
			if(x % 11 == 5) {
				
			System.out.println(x);
			
			
			}
			
		}

	}

}
