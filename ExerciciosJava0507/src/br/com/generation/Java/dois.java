package revisaoBasica;

import java.util.Scanner;

public class dois {
	
	public static void main(String[] args) {
		
		double saldo, saldoreajuste;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual o saldo devedor do contrato? R$ ");
		saldo = ler.nextDouble();
		
		saldoreajuste = saldo * 0.01 + saldo;
		
		System.out.println("O valor foi reajustado em 1%. Ficando o montante em R$ " + saldoreajuste + " reais");
	}

}
