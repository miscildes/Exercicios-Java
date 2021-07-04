package br.com.generation.aula02.laçoCondicional;

import java.util.Scanner;

public class LaçoCondicional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) /2;
		
		System.out.println("A média do aluno é: " + media);
		
		if(media >= 7.0) {
			System.out.println("Aprovado");
			
		}
		else if (media >=5.0 && media < 7.0) {
			System.out.println("Em recuperação");
		}
		else {
			System.out.println("Reprovado");
		}
		
	}

}
