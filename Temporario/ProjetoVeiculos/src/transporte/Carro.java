package transporte;

public class Carro extends Veiculo {
	private int quantidadePortas;

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		if(quantidadePortas > 0) {
			this.quantidadePortas = quantidadePortas;
		}
	}
	
	public void exibirCarro() {
		System.out.println("Marca: "+ getMarca());
		System.out.println("Ano: "+ getAno());
		System.out.println("Quantidade de portas: "+ getQuantidadePortas());
	}
	
}
