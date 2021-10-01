package revisaoBasica;

import java.util.Scanner;
import java.time.LocalDateTime;

public class quatro {

	public static void main(String[] args) {
		
		int idade;
		String nome;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Olá, qual seu nome? ");
		nome = ler.next();
		
		System.out.println("Bem vindo " + nome + ". Qual a sua idade? ");
		idade = ler.nextInt();
		
		if (idade < 18) {
			System.out.println("Desculpe, sua idade é " + idade + " anos. Você não tem permissão de acesso ao site. ");
		}
		else {
			System.out.println("Acesso permitido ao site!");
		}
	}

}
