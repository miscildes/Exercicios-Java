package revisaoBasica;

import java.util.Scanner;

public class dez {
	public static void main(String[] args) {
		
		double real, dolar;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos d�lares voc� tem? ");
		dolar = ler.nextDouble();
		
		real = dolar * 5.44;
		
		System.out.printf("Voc� tem %.2f reais", real);
	}
}
