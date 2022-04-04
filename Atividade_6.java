import java.util.Scanner;

public class Atividade_6 {

	public static void main(String[] args) {
		/*Escrever um programa que receba vários números inteiros no teclado. E no
			final imprimir a média dos números múltiplos de 3. Para sair digitar
			0(zero).(DO...WHILE)*/
	
	int  y = 0, num, multi = 0, media = 0;
	Scanner leia = new Scanner(System.in);
	
	
	
	
	do {
		
		System.out.print("Digite um numero: ");
		num = leia.nextInt();
		if (num > 0) {
		if (num % 3 == 0) {
			multi += num;
		}
		   y++;
		
		}
		
		
		
	}while(num != 0);
	

	
	media = multi / y;
	
	
	
	System.out.print("O resultado foi: "+ media);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
