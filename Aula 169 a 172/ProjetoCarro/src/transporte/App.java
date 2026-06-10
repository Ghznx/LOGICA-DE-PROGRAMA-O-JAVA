package transporte;

public class App {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		Carro carro2 = new Carro("Toyota");
		
		Carro carro3 = new Carro("Mustang", 2005);
		
		carro1.exibirCarro();
		
		System.out.println("");
		
		carro2.exibirCarro();
		
		System.out.println("");
		
		carro3.exibirCarro();
	}

}
