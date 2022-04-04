import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		
		/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		  21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		  idade for =-99. (WHILE)
		 */

Scanner leia = new Scanner(System.in);


double x = 0.0, idade = 0.0, jovem = 0, idoso = 0.0;	
		
		
	while(idade != -99) {
	
	
	System.out.println("Escreva sua idade");
	idade = leia.nextFloat();
	if(idade > 0) {
		x++;
if(idade <= 21 && idade > 0) {
	jovem++;
}
if(idade > 50) {
	idoso++;
}	
	
	
	}
	}
jovem = (jovem / x) * 100;
idoso = (idoso / x) * 100;	
	
System.out.println("De "+x+" idades inseridas:");	
		
System.out.println(jovem+"%, essa é a quantidade de jovens (pessoas com menos de 21 anos)");		
System.out.println(idoso+"%, essa é a quantidade de idosos (pessoas com mais de 50 anos)");		
		
		
		
		
		
		
		
		
		
		
		

	}

}
