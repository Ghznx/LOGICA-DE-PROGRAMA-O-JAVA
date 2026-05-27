package Atividade;

import java.util.Scanner;

public class Operações2Inteiros {

	public static void main(String[] args) {
		int x, y, z, resultado;
		
		Scanner entrada =  new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		x = entrada.nextInt();
		
		System.out.print("Informe o segundo número: ");
		y = entrada.nextInt();
		
		System.out.print("Informe o terceiro número: ");
		z = entrada.nextInt();
		
		resultado = x * y * z;
		
		System.out.printf("O resultado do produto é %d", resultado);

	}

}
