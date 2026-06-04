package comercio;

public class Produto {
	private String nome;
	private double preco;
	private int estoque;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome != null && !nome.isEmpty()) {
			this.nome = nome;
		}
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco > 0) {
			this.preco = preco;
		}
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		if(estoque >= 0) {
			this.estoque = estoque;
		}
	}
	
	public void exibirDadosBasicos() {
		System.out.println("Produto: "+ getNome());
		System.out.println("Preço: "+ getPreco());
		System.out.println("Quantidade no estoque: "+ getEstoque());
	}
	
}
