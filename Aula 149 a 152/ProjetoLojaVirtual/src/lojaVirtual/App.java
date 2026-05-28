package lojaVirtual;

public class App {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		
		Cliente cliente1 = new Cliente();
		
		produto1.setNome("Arroz");
		
		produto1.setPreco(10);
		
		produto1.setQuantidadeEstoque(50);
	
        System.out.println(produto1.getNome());
		
		System.out.println(produto1.getPreco());
		
		System.out.println(produto1.getQuantidadeEstoque());
		
        cliente1.setNome("Ana");
		
		cliente1.setIdade(19);
		
		cliente1.setEmail("Ana@gmail.com");
	
        System.out.println(cliente1.getNome());
		
		System.out.println(cliente1.getIdade());
		
		System.out.println(cliente1.getEmail());
		
		
	}

}
