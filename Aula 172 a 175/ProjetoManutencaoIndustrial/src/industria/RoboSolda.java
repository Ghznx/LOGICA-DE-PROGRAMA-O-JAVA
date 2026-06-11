package industria;

public class RoboSolda extends Maquina{
	private int quantidadeEixos;

	public int getQuantidadeEixos() {
		return quantidadeEixos;
	}

	public void setQuantidadeEixos(int quantidadeEixos) {
		if(quantidadeEixos <= 0) {
			System.out.println("Quantidade invalida!");
		} else{
			this.quantidadeEixos = quantidadeEixos;
		}
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Quantidade de eixos: "+ quantidadeEixos);
	}
	
	@Override
	public void realizarManutencao() {
		System.out.println("Calibração dos eixos e verificacao do sistema de soldas realizadas");
	}
}
