
public class Atividade_1 {

	public static void main(String[] args) {
	
	
	/*Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)	*/
				
	double x, resultado;	
		
		System.out.println("Esses são os numeros que dividindo por 11 restarão 5");
		
		for(x = 1000; x >= 1000 && x <= 1999; x++) {
			
			if(x % 11 == 5) {
				
			System.out.println(x);
			
			
			}
			
		}

	}

}
