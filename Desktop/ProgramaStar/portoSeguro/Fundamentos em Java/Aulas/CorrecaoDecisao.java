package portoSeguro;

import java.util.Scanner;

public class CorrecaoDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Faça um sistema que leia um número inteiro e mostre uma mensagem
		 * indicando se este número é par ou ímpar, e se é positivo ou negativo.
		 */
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número inteiro: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			if(numero >= 0) {
				System.out.println("\nEste número é par e positivo.");
			} else {
				System.out.println("\nEste número é par e negativo.");
			}
		} else {
			if (numero >= 0) {
				System.out.println("\nEste número é ímpar e positivo.");
			} else {
				System.out.println("\nEste número é ímpar e negativo.");
			}
		}
	}

}
