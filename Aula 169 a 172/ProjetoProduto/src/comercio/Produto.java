package comercio;

public class Produto {
	String nome;
	double preco;
	int estoque;
	
	public Produto() {
		nome = "Produto padrao";
		preco = 0.0;
		estoque = 0;
	}
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public void exibirProduto() {
		System.out.println("Produto: "+ nome);
		System.out.println("Preço: "+ preco);
		System.out.println("Estoque: "+ estoque);
	}
}
