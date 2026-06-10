package comercio;

public class App {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		
		Produto produto2 = new Produto("Teclado", 200);
		
		Produto produto3 = new Produto("Mouse", 160, 3);
		
		produto1.exibirProduto();
		
		System.out.println("");
		
		produto2.exibirProduto();
		
		System.out.println("");
		
		produto3.exibirProduto();
		
		
	}

}
