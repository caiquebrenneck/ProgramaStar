package portoSeguro;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1,n2,resultado = 0;
		int opcao;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número: ");
		n1 = ler.nextFloat();
		System.out.println("\nEntre com o segundo número: ");
		n2 = ler.nextFloat();
		
		System.out.println("\n\t\tCalculadora");
		System.out.println("1 - Soma");
		System.out.println("2 - Diferença");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("\nEntre com a sua opção: ");
		opcao = ler.nextInt();
		
		switch(opcao) {
		case 1:
			resultado = n1 + n2;
			break;
		case 2:
			resultado = n1 - n2;
			break;
		case 3:
			resultado = n1 * n2;
			break;
		case 4:
			if(n2 == 0) {
				System.out.println("\nImpossível dividir por zero!");
			} else {
			resultado = n1 / n2;
			}
			break;
		default:
			System.out.println("\nOpção Inválida!");
		}
		System.out.println("\nResultado: " + resultado);
		
	}

}
