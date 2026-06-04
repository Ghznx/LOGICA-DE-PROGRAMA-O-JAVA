package transporte;

public class Moto extends Veiculo{
	private boolean descansoAtivo;

	public boolean isDescansoAtivo() {
		return descansoAtivo;
	}

	public void setDescansoAtivo(boolean descansoAtivo) {
		descansoAtivo = true;
	}
	
	public void puxarDescanso() {
		descansoAtivo = true;
		
		System.out.println("Descanso da moto acionado");
	}
	
	public void colocarDescanso() {
		descansoAtivo = false;
		
		System.out.println("Descanso da moto recolhido");
	}
	
	public void exibirMoto() {
		System.out.println("Marca: "+ getMarca());
		System.out.println("Ano: "+ getAno());
		System.out.println("Estado do descanso: "+ descansoAtivo);
	}

}
