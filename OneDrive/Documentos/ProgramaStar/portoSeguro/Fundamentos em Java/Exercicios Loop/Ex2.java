package exerciciosLoop;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int numero,impar = 0,par = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 10 ; i++) {
			
			System.out.println("Digite um número inteiro:");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}
			
		}
		System.out.println("\n\tQuantidade de números pares: " + par);
		System.out.println("\n\tQuantidade de números ímpares: " + impar);
	}

}
