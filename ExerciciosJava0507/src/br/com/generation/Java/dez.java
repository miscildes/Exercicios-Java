package revisaoBasica;

import java.util.Scanner;

public class dez {
	public static void main(String[] args) {
		
		double real, dolar;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos dólares você tem? ");
		dolar = ler.nextDouble();
		
		real = dolar * 5.44;
		
		System.out.printf("Você tem %.2f reais", real);
	}
}
