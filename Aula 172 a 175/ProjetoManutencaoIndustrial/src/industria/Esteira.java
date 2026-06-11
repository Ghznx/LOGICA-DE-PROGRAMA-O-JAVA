package industria;

public class Esteira extends Maquina{
	private double velocidade;

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		if(velocidade < 0) {
			System.out.println("Velocidade invalida!");
		} else{
			this.velocidade = velocidade;
		}
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Velocidade: "+ velocidade);
	}
	
	@Override
	
	public void realizarManutencao() {
		super.realizarManutencao();
		System.out.println("Lubrificação e ajuste de alinhamento da esteira ativado!");
	}
	
}
