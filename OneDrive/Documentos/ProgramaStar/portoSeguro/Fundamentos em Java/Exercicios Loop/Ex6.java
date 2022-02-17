package exerciciosLoop;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Escrever um programa que receba vários números inteiros no teclado. E no final
		*  imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE) */
		
		float numero,media,quantNum = 0,soma= 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			/* Solicita um número, adiciona ele à variável 'soma' 
			e aumenta o contador 'quantNum' para realizar a média depois */
			System.out.println("\nDigite um número inteiro ou 0 (zero) para sair:");
			numero = leia.nextFloat();
			
			if(numero % 3 == 0 && numero != 0) {
				soma += numero;
				quantNum++;
			}
			
		} while (numero != 0);
		
		if(quantNum != 0) {
			media = soma / quantNum;
			System.out.printf("\n\t A média dos números múltiplos de 3 é: %2.2f",media);
		} else {
			System.out.println("\n\t Não houve múltiplos de 3 digitados.");
		}
	}

}
