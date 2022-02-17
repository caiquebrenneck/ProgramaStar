package exerciciosLoop;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		*  21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		*  idade for =-99. (WHILE) */
		
		int idade = 0, menorQue21 = 0, maiorQue50 = 0;
		Scanner leia = new Scanner(System.in);
		
		while (idade != -99) {
			
			System.out.println("\nDigite sua idade ou digite \"-99\" para sair: ");
			idade = leia.nextInt();
			while (idade <= 0 && idade != -99) {
				System.out.println("Por favor, digite uma idade válida.");
				break;
			}
			
			if(idade < 21 && idade > 0) {
				menorQue21++;
			} else if (idade > 50) {
				maiorQue50++;
			}
			
		}
		System.out.printf("\n\tPessoas com menos de 21 anos: %d"
							+ "\n\tPessoas com mais de 50 anos: %d",
							menorQue21,maiorQue50);
	}

}
