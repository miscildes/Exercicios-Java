package revisaoBasica;

import java.util.Scanner;

public class seis {

	public static void main(String[] args) {

		int escolha;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("MetFica. Escolha uma opção: ");
		System.out.println("1- Pagar");
		System.out.println("2- Alugar");
		System.out.println("1- Cancelar");
		escolha = ler.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println("O valor foi pago");
			break;
		case 2:
			System.out.println("Alugado por R$10,00/mês");
			break;
		case 3:
			System.out.println("Serviço cancelado. Saia daqui.");
			break;
		
		}
	}

}
