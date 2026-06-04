package comercio;

public class ProdutoDigital extends Produto {
	private String formatoArquivo;
	private int tamanhoArquivo;
	private Produto produto;
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		if(produto != null) {
			this.produto = produto;
		}
	}
	public String getFormatoArquivo() {
		return formatoArquivo;
	}
	public void setFormatoArquivo(String formatoArquivo) {
		if(formatoArquivo != null && !formatoArquivo.isEmpty()) {
			this.formatoArquivo = formatoArquivo;
		}
	}
	public int getTamanhoArquivo() {
		return tamanhoArquivo;
	}
	public void setTamanhoArquivo(int tamanhoArquivo) {
		if(tamanhoArquivo > 0) {this.tamanhoArquivo = tamanhoArquivo;
		
		}
	}
	
	public void exibirProdutoDigital() {
		System.out.println("Produto: "+ getNome());
		System.out.println("Preço: "+ getPreco());
		System.out.println("Quantidade no estoque: "+ getEstoque());
		System.out.println("Formato do arquivo: "+ getFormatoArquivo());
		System.out.println("Tamanho do arquivo: "+ getTamanhoArquivo());
	}
}
