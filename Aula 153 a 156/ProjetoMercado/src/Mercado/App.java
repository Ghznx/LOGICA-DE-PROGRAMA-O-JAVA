package Mercado;

public class App {

	public static void main(String[] args) {
		
		Item item1 = new Item();
		Fornecedor fornecedor1 = new Fornecedor();
		
		item1.setDescricao("Arroz ");
		item1.setPreco(100);
		item1.setQuantidade(10);
		
		fornecedor1.setNome("Guilherme ");
		fornecedor1.setTelefone("55 999999999");
		fornecedor1.setCidade("Valença ");
		
		System.out.println("Produto: "+ item1.getDescricao());
		System.out.println("Valor: "+ item1.getPreco());
		System.out.println("Quantidade: "+ item1.getQuantidade()+ "\n");
		
		System.out.println("Fornecedor: "+fornecedor1.getNome());
		System.out.println("Telefone do fornecedor: "+fornecedor1.getTelefone());
		System.out.println("Cidade: "+fornecedor1.getCidade());

	}

}
