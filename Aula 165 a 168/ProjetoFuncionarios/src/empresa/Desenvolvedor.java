package empresa;

public class Desenvolvedor extends Funcionario{
	private int horasExtras;

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		if(horasExtras <= 0) {
			System.out.println("Não há horas extras!");
		} else{
			this.horasExtras = horasExtras;
		}
	}
	
	@Override
	public void calcularSalario() {
		System.out.println("Salario final: R$"+ (getSalarioBase()+(horasExtras * 50)));
	}
}
