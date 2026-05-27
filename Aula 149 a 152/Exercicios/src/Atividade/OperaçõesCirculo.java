package Atividade;

import java.util.Scanner;

public class OperaçõesCirculo {

	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		
		int numero;
		
		System.out.print("Informe o raio do circulo: ");
		numero = entrada.nextInt();
		
		System.out.printf("Diâmetro do circulo: %d\n", numero * 2 );
		
		System.out.printf("Circunferência do raio: %.25f\n", 2 * Math.PI * numero);
		
		System.out.printf("Área: %.2f", Math.PI * Math.pow(numero, 2));

	}

}
