package revisaoBasica;

import java.util.Scanner;

public class um {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, media;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		nota1 = ler.nextDouble();
		System.out.println("Digite a segunda nota");
		nota2 = ler.nextDouble();
		System.out.println("Digite a terceira nota");
		nota3 = ler.nextDouble();
		System.out.println("Digite a quarta nota");
		nota4 = ler.nextDouble();
		
		media = (nota1+nota2+nota3+nota4) / 4;
		
		System.out.println("A média do aluno é: " + media);
		
		if (media >= 6) {
			System.out.println("O aluno está aprovado");
		}
		if (media >= 5 && media <=5.9) {
			System.out.println("O aluno está em recuperação");
		}
		if (media <= 4.9) {
			System.out.println("O aluno está reprovado");
		}
	}

}
