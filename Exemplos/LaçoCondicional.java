package br.com.generation.aula02.la�oCondicional;

import java.util.Scanner;

public class La�oCondicional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) /2;
		
		System.out.println("A m�dia do aluno �: " + media);
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
			
		}
		else if (media >=5.0 && media < 7.0) {
			System.out.println("Em recupera��o");
		}
		else {
			System.out.println("Reprovado");
		}
		
	}

}
