package exerciciosIfElse;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Desenvolva um sistema em que:
		- Leia 4 (quatro) números;
		- Calcule o quadrado de cada um;
		- Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		- Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 */
		
		float num1,num2,num3,num4,pot1,pot2,pot3,pot4;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite 4 números, um de cada vez:");
		num1 = leia.nextFloat();
		num2 = leia.nextFloat();
		num3 = leia.nextFloat();
		num4 = leia.nextFloat();
		
		pot1 = (float) Math.pow(num1, 2);
		pot2 = (float) Math.pow(num2, 2);
		pot3 = (float) Math.pow(num3, 2);
		pot4 = (float) Math.pow(num4, 2);
		
		if (pot3 >= 1000) {
			System.out.printf("\n\t %.0f^2 = %.0f",num3,pot3);
		} else {
			System.out.printf("\n\t %.0f^2 = %.0f"
					+ "\n\t %.0f^2 = %.0f"
					+ "\n\t %.0f^2 = %.0f"
					+ "\n\t %.0f^2 = %.0f",
					num1,pot1,num2,pot2,num3,pot3,num4,pot4);
		}
		
	}

}
