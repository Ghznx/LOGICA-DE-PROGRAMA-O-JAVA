package comercio;

public class Pedido {
	private String cliente;
	private Produto produto;
	private int quantidade;
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		if(cliente != null && !cliente.isEmpty()) {
			this.cliente = cliente;
		}
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		if(produto != null) {
			this.produto = produto;
		}
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		if(quantidade > 0) {
			this.quantidade = quantidade;
		}
		
	}
	
	public void exibirResumoPedido() {
		System.out.println("------RESUMO DO PEDIDO------");
		System.out.println("Cliente: "+ cliente);
		System.out.println("Produto: "+ produto.getNome());
		System.out.println("Quantidade: "+ quantidade);
		
		double total = produto.getPreco() * quantidade;
		
		if(produto instanceof ProdutoFisico) {
			ProdutoFisico produtoFisico = (ProdutoFisico) produto;
			
			System.out.println("Tipo: Produto fisico");
			System.out.println("Frete: R$ "+ produtoFisico.getFrete());
			
			total = total + produtoFisico.getFrete();
			
		} else if(produto instanceof ProdutoDigital) {
			ProdutoDigital produtoDigital = (ProdutoDigital) produto;
			
			System.out.println("Tipo: Produto digital");
			System.out.println("Formato: "+ produtoDigital.getFormatoArquivo());
			System.out.println("Tamanho: "+ produtoDigital.getTamanhoArquivo());
		}
	}
}
