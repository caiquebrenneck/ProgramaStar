package exerciciosLoop;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Uma empresa desenvolveu uma pesquisa para saber as características
		*  psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		*  era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		*  (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		*  agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		*  pessoas, calcule e mostre: (WHILE)
		●  o número de pessoas calmas;
		●  o número de mulheres nervosas;
		●  o número de homens agressivos;
		●  o número de outros calmos;
		●  o número de pessoas nervosas com mais de 40 anos;
		●  o número de pessoas calmas com menos de 18 anos. */
		
		int idade,opcaoSexo,opcaoTemperamento,participantes = 0;
		int feminino = 0, masculino = 0, outros = 0;
		int calmo = 0, mulherNervosa = 0, homemAgressivo = 0, outroCalmo = 0, menor18 = 0, maior40 = 0;
		String nome;
		Scanner leia = new Scanner(System.in);
		
		while (participantes <= 149) { //A variável foi inicializada em 0, então precisa diminuir um para dar 150
			
			//Pergunta nome, idade, sexo e temperamento dos participantes
			System.out.println("\n\tDigite seu nome: ");
			nome = leia.next();
			nome = null; // Como o nome é irrelevante para os resultados pedidos, o valor da variável é apagado
			
			System.out.println("\n\tDigite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("\n\t Qual seu sexo?"
					+ "\n\t 1 - Feminino"
					+ "\n\t 2 - Masculino"
					+ "\n\t 3 - Outro");
			opcaoSexo = leia.nextInt();
			
			System.out.println("\n\tQual seu temperamento?"
					+ "\n\t 1 - Calmo(a)"
					+ "\n\t 2 - Nervoso(a)"
					+ "\n\t 3 - Agressivo(a)");
			opcaoTemperamento = leia.nextInt();
			
			//Switch Case para opção de Sexo
			switch(opcaoSexo) {
			case 1:
				feminino++;
				break;
			case 2:
				masculino++;
				break;
			case 3:
				outros++;
				break;
			default:
				System.out.println("Insira uma opção válida.");
			}
			
			//Switch Case para opção de Temperamento
			switch(opcaoTemperamento) {
			case 1:
				calmo++;
				if (idade < 18) {
					menor18++;
				}
				if (opcaoSexo == 3) {
					outroCalmo++;
				}
				break;
			case 2:
				if(idade > 40) {
					maior40++;
				}
				if(opcaoSexo == 1) {
					mulherNervosa++;
				}
				break;
			case 3:
				if(opcaoSexo == 2) {
					homemAgressivo++;
				}
				break;
			default:
				System.out.println("Insira uma opção válida.");
			}
			
			//Incrementa 1 no número de participantes até chegar aos 150.
			participantes++; 

		}
			System.out.println("\n\t Número de pessoas calmas: " + calmo);
			System.out.println("\n\t Número de mulheres nervosas: " + mulherNervosa);
			System.out.println("\n\t Número de homens agressivos: " + homemAgressivo);
			System.out.println("\n\t Número de outros calmos: " + outroCalmo);
			System.out.println("\n\t Número de pessoas nervosas com mais de 40 anos: " + maior40);
			System.out.println("\n\t Número de pessoas calmas com menos de 18 anos: " + menor18);
		
	}

}
