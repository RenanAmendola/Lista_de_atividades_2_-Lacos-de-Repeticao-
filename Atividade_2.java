import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			/*
			 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.
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
	
	System.out.println("Voc� digitou "+numpar+" numeros pares e "+numimp+" numeros impares");
	
	
	
	
	
	
	}

}
