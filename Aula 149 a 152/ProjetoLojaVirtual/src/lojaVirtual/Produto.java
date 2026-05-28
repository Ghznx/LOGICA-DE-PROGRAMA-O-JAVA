package lojaVirtual;

public class Produto {
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if(preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("Valor inválido para preço!");
		}
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		if(quantidadeEstoque < 0) {
			System.out.println("Valor inválido para estoque!");
		} else {
			this.quantidadeEstoque = quantidadeEstoque;
		}
	}
}
