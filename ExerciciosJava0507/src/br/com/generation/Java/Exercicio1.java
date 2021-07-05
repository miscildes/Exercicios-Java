package br.com.generation.Java;

public class Exercicio1 {

	public static void main(String[] args) {
		
		double numeros, divisor=5;
		
		for(numeros = 1000; numeros <= 1999; numeros++) {
			if (numeros %11==5) {
				System.out.println(numeros);
			}
			
		}

	}

}
