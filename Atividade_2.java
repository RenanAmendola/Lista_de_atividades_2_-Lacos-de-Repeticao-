import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*
			 * Ler 10 números e imprimir quantos são pares e quantos são ímpares.
			 */
	
	int x,num,numpar = 0,numimp = 0;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Escreva 10 numeros");
	
	for(x = 1; x <= 10; x++) {
		num = leia.nextInt();
		
		
		if(num % 2 == 0) {
			numpar++;
		}
		else {
			numimp++;
		}
		
	}
	
	System.out.println("Você digitou "+numpar+" numeros pares e "+numimp+" numeros impares");
	
	
	
	
	
	
	}

}
