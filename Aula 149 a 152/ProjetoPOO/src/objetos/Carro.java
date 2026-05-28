package objetos;

public class Carro {
	String marca;
	String cor;
	String modelo;
	String motorizacao;
	int qtdLugares;
	boolean direcaoHidraulica;
	int km;
	boolean estarLigado;
	
	void ligar() {
		estarLigado = true;
		System.out.println("Veículo ligado!");
	}
	void desligar() {
		estarLigado = false;
		System.out.println("Veículo desligado!");
	}
}
