package comercio;

public class App {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		ProdutoFisico pf1 = new ProdutoFisico();
		ProdutoDigital pd1 = new ProdutoDigital();
		
		p1.setEstoque(5);
		p1.setNome("Arroz");
		p1.setPreco(40);
		
		pf1.setFrete(5);
		pf1.setPeso(6);
		
		pd1.setFormatoArquivo("mp4");
		pd1.setTamanhoArquivo(30);
		
		p1.exibirDadosBasicos();
		
		System.out.println("Valor total: "+ pf1.calcularValorTotal(40, 5));
		
		pd1.exibirProdutoDigital();
		
		Pedido pedido1 = new Pedido();
		
		pedido1.setCliente("Carlos");
		pedido1.setProduto(pd1);
		pedido1.setQuantidade(1);
		
		Pedido pedido2 = new Pedido();
		
		pedido2.setCliente("Ana");
		pedido2.setProduto(pf1);
		pedido2.setQuantidade(2);
		
		pedido1.exibirResumoPedido();
		
		pedido2.exibirResumoPedido();
		
	}

}
