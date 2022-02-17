package exerciciosLoop;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Crie um programa que leia um número do teclado até que encontre um número
		*  igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE) */
		
		int numero, soma = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite um número inteiro ou 0 (zero) para sair:");
			numero = leia.nextInt();
			soma += numero;
		} while(numero != 0);
		
		System.out.println("\n\t A soma dos números digitados é: " + soma);
	}

}
