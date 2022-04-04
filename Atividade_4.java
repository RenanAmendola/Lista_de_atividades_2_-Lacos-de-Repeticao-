import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*Uma empresa desenvolveu uma pesquisa para saber as características
			psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
			era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
			(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
			agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
			pessoas, calcule e mostre: (WHILE)
			 o número de pessoas calmas;
			 o número de mulheres nervosas;
			 o número de homens agressivos;
			 o número de outros calmos;
			 o número de pessoas nervosas com mais de 40 anos;
			 o número de pessoas calmas com menos de 18 anos. */

	
		
	int pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, velhoNervoso = 0, jovensCalmos =0 ;	
	
	int idade, sexo, opcao = 2,x=0;
	
	Scanner leia = new Scanner(System.in);
	
	while( x != 3) {
		x++;

	System.out.print("Informe a sua idade: ");
	idade = leia.nextInt();
	while(idade < 1 || idade > 120) {
		System.out.print("Informe uma idade valida: ");
		idade = leia.nextInt();
	}
	
	
	System.out.print("Informe a seu sexo: ");
	System.out.println("1 - Feminino / 2 - Masculino / 3 - Outro ");
	sexo = leia.nextInt();
	while(sexo < 1 || sexo > 3) {
		System.out.print("Informe um numero valido: ");
		System.out.println("1 - Feminino / 2 - Masculino / 3 - Outro ");
		sexo = leia.nextInt();
	}
	
	System.out.print("Informe seu nivel de estresse : ");
	System.out.println("1 - Pessoa calma / 2 - Pessoa nervoda / 3 - Pessoa agressiva");
	opcao = leia.nextInt();
	while(opcao < 1 || opcao > 3) {
		System.out.print("Informe um numero valido: ");
		System.out.println("1 - Pessoa calma / 2 - Pessoa nervoda / 3 - Pessoa agressiva");
		opcao = leia.nextInt();
	}
	
	if(opcao == 1) {
		pessoasCalmas++;
	}
	
	if(opcao == 2 && sexo == 1) {
		mulheresNervosas++;
	}
	
	if(opcao == 3 && sexo == 2) {
		homensAgressivos++;
	}

	if(opcao == 1 && sexo == 3) {
		outrosCalmos++;
	}

	if(opcao == 2 && idade >= 40) {
		velhoNervoso++;
	}
		
	if(opcao == 1 && idade <= 18) {
		jovensCalmos++;
	}
	}

	
	System.out.println("Esse é o numero de pessoas calmas " + pessoasCalmas);
	
	System.out.println("Esse é o número de mulheres nervosas " + mulheresNervosas);
	
	System.out.println("Esse é o número de homens agressivos " + homensAgressivos);
	
	System.out.println("Esse é o número de outros calmos " + outrosCalmos);
	
	System.out.println("Esse é o número de pessoas nervosas com mais de 40 anos " + velhoNervoso);
	
	System.out.println("Esse é o número de pessoas calmas com menos de 18 anos " + jovensCalmos);
	
	
	
	
	
	
	}
	
	}


