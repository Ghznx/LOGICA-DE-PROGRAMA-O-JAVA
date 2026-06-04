package comercio;

public class ProdutoFisico extends Produto {
	private double peso;
	private double frete;
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
	public double getFrete() {
		return frete;
	}
	public void setFrete(double frete) {
		if(frete >= 0) {
			this.frete = frete;
		}
	}
	
	public double calcularValorTotal(double preco, double frete) {
		return preco + frete;
	}
	
}
