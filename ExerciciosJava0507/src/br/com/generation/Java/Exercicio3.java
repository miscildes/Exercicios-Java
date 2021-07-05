package br.com.generation.Java;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		int idade, contador, total;
		Scanner ler = new Scanner(System.in);

		for (contador = 1; contador <= 10; contador++) {

			System.out.println("Digite a idade dos participantes: ");
			idade = ler.nextInt();
			if(idade <= 21) {
				
				System.out.println("N sei");
			}
		}
	}

}
