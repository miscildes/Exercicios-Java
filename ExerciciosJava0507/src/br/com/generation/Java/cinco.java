package revisaoBasica;

import java.util.Scanner;

public class cinco {
	public static void main(String[] args) {
		
		double peso, altura, imc;
		String nome;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Calculadora de IMC. Qual seu nome? ");
		nome = ler.next();
		System.out.println("Bem vindo " + nome + ". Qual seu peso atual?(Kg) ");
		peso = ler.nextDouble();
		System.out.println("E a sua altura?(Cm) ");
		altura = ler.nextDouble();
		
		imc = peso / (altura*altura);
		System.out.println(nome + ", seu IMC é: " + imc);
		
		if (imc <= 18.5) {
			System.out.println("Você está abaixo do peso.");
		}
		if (imc > 18.6 && imc <= 24.9) {
			System.out.println("Você está com o peso normal");
		}
		if (imc >= 25 && imc <= 29.9) {
			System.out.println("Você está com sobrepeso");
		}
		if (imc >= 30 && imc <= 34.9 ) {
			System.out.println("Você está com obesidade grau I");
		}
		if (imc >= 35 && imc <= 39.9) {
			System.out.println("Você está com obesidade grau II");
		}
		if (imc >= 40) {
			System.out.println("Você está com obesidade mórbida.");
		}
	}
}
