package br.com.generation.aula01.exemplovariavel;

import java.util.Scanner;

public class GalaoLitros {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int num1, num2;
		int soma;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("A soma é: " + soma);

	}

}
