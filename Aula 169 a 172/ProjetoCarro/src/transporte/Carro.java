package transporte;

public class Carro {
	String modelo;
	int ano;
	
	public Carro() {
		modelo = "Nao informado";
		ano = 0;
	}
	
	public Carro(String modelo) {
		this.modelo = modelo;
	}
	
	public Carro(String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void exibirCarro() {
		System.out.println("Modelo: "+ modelo);
		System.out.println("Ano: "+ ano);
	}
}
