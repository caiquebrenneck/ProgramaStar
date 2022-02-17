package portoSeguro;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá, mundo!");
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura,nota1,nota2,nota3,media;
		
		System.out.println("\n\tDigite seu nome:");
		nome = leia.nextLine();		
		System.out.println("\n\tDigite sua idade:");
		idade = leia.nextInt();		
		System.out.println("\n\tDigite sua altura");
		altura = leia.nextFloat();

		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();		
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();		
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("\nMédia aritmética: %2.2f", media);
		
		if(media >= 7 && media <= 10) {
			System.out.println("\nAluno aprovado!");
		}
		else if(media >= 5 && media <= 7) {
			System.out.println("\nAluno de recuperação.");
		}
		else if(media >= 0 && media < 5) {
			System.out.println("\nAluno reprovado.");
		}
		else {
			System.out.println("\nMédia Inválida!");
		}
		
		System.out.printf("\nMeu nome é %s,"
				+ " tenho %d anos "
				+ "e minha altura é de %.2fm.\n",
				nome,idade,altura);
	 }

}
