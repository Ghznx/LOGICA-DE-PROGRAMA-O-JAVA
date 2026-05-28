package programa;


import java.util.Scanner;


public class Adição {
	
	public static void main(String[] args) {
	   	
		Scanner entrada = new Scanner(System.in);
        
		int numero1;
		int numero2;
		int soma;
		
		System.out.print("Digite o primeiro numero: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		numero2 = entrada.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.printf("A soma é %d%n ", soma);
	}

}
