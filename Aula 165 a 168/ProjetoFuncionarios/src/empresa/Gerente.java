package empresa;

public class Gerente extends Funcionario{
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		if(bonus < 0) {
			System.out.println("Bonus negativo!");
		} else{
			this.bonus = bonus;
		}
	}
	
	@Override
	public void calcularSalario() {
		System.out.println("Salario final: R$"+ (getSalarioBase()+bonus));
	}
}
