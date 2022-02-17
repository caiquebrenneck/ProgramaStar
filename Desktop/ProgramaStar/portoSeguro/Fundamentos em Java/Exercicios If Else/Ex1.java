package exerciciosIfElse;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* (1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
		* rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o
		* estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de
		* R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P
		* (peso de tomates) e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na
		* variável M o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis
		* com o conteúdo ZERO.
		*/
		
		float tomate, multa = 0, excesso = 0;
		
		Scanner peso = new Scanner(System.in);
		
		System.out.println("Qual o peso dos tomates (kg)?");
		tomate = peso.nextFloat();
		
		if(tomate > 50) {
			excesso = (tomate - 50);
			multa = (excesso * 4);
			System.out.printf("Você ultrapassou %.2fkg do limite máximo permitido pelo regulamento e pagará "
					+ "R$4,00 por kg excedido. O valor de sua multa será de: R$ %.2f.", excesso,multa);
		} else {
			System.out.printf("Peso do tomate: %.2fkg;"
					+ "\nPeso excedido: %.0fkg;"
					+ "\nValor da multa: R$%.0f.", tomate,excesso,multa);
		}
	}

}
