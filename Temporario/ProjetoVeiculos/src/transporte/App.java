package transporte;

public class App {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		carro1.setMarca("Lamborghini");
		carro1.setAno(2014);
		
		carro1.setQuantidadePortas(2);
		
		carro1.exibirCarro();
		
		Moto moto1 = new Moto();
		
		moto1.setMarca("Kawasaki");
		moto1.setAno(2014);
		moto1.colocarDescanso();
		moto1.exibirMoto();

	}

}
