package revisaoBasica;

import java.util.Scanner;

public class sete {

	public static void main(String[] args) {

		String nome;
		int escolha = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual seu nome? ");
		nome = ler.next();
		
		System.out.println(nome + ", escolha um número: ");
		escolha = ler.nextInt();
		
		switch (escolha) {
		case 1:
		case 2:
			System.out.println("Errou");
			break;
		case 3:
			System.out.println("Acertou");
			break;
		default:
			System.out.println("Opção errada parceiro");
			break;
		}
	}

}
