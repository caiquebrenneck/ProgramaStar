package exerciciosIfElse;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
		* indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
		* varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
		* suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
		* intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
		* notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
		* medido e emita a notificação adequada aos diferentes grupos de empresas.
		*/
		
		float indice;
		String g1 = "Grupo 1", g2 = "Grupo 2", g3 = "Grupo 3";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\tÍndice de poluição:");
		indice = leia.nextFloat();
				
		if (indice <= 0.25) {
			System.out.println("\n\tÍndice de poluição em nível aceitável.");
		} else if (indice < 0.4) {
			System.out.printf("\n\tÍndice de poluição acima do aceitável. "
					+ "%s, interromper as atividades imediatamente.",g1);
		} else if (indice < 0.5) {
			System.out.printf("\n\tÍndice de poluição acima do aceitável. "
					+ "%s e %s, interromper as atividades imediatamente.",g1,g2);
		} else {
			System.out.printf("\n\tÍndice de poluição acima do aceitável. "
					+ "%s, %s e %s, interromper as atividades imediatamente.",g1,g2,g3);
		}
	}

}
