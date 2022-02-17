package exerciciosIfElse;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
		* horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
		* por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
		* armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
		* trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
		* excedente. */
		
		String operario;
		float horas, salario = 500, excedente, horaExtra, salarioTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tQual seu código de trabalho?");
		operario = leia.nextLine();
		System.out.println("\n\tQuantas horas você trabalhou?");
		horas = leia.nextFloat();
		
		if(horas > 50) {
			excedente = (horas - 50);
			horaExtra = (excedente * 20);
			salarioTotal = (horaExtra + salario);
			
			System.out.printf("\nCódigo de operário: %s"
					+ "\nSalário: R$%.2f"
					+ "\nHora(s) Extra(s): %.0f hora(s), equivalente a R$%.2f"
					+ "\nSalário total: R$%.2f",
					operario,salario,excedente,horaExtra,salarioTotal);
		} else {
			System.out.printf("\nCódigo de operário: %s"
					+ "\nSalário total: R$%.2f",
					operario,salario);
		}
	}

}
