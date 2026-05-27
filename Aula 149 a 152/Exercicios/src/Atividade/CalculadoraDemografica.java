package Atividade;

public class CalculadoraDemografica {

	public static void main(String[] args) {
		long populacaoAtual;
		double taxaCrescimento;
		taxaCrescimento = 0.0085;
		populacaoAtual = 8256114946L;
		
		System.out.printf("População estimada após 1 ano: %.0f%n", populacaoAtual * Math.pow(1 + taxaCrescimento, 1));
		System.out.printf("População estimada após 2 anos: %.0f%n", populacaoAtual * Math.pow(1 + taxaCrescimento, 2));
		System.out.printf("População estimada após 3 anos: %.0f%n", populacaoAtual * Math.pow(1 + taxaCrescimento, 3));
		System.out.printf("População estimada após 4 anos: %.0f%n", populacaoAtual * Math.pow(1 + taxaCrescimento, 4));
		System.out.printf("População estimada após 5 anos: %.0f%n", populacaoAtual * Math.pow(1 + taxaCrescimento, 5));

	}

}
