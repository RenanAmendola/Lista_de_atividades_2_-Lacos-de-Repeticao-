import java.util.Scanner;

public class Atividade_5 {

	public static void main(String[] args) {
		
		/*
		Crie um programa que leia um n�mero do teclado at� que encontre um
		n�mero igual a zero. No final, mostre a soma dos n�meros
		digitados.(DO...WHILE)*/
		
		int x = 0 , somax = 0;
		Scanner leia = new Scanner(System.in);
		
	do {
		System.out.print("Digite um numero: ");
		x = leia.nextInt();
			
		somax += x;	
			
		}while(x != 0);
		
		System.out.println("A soma dos numeros deu " + somax);
		

	}

}
