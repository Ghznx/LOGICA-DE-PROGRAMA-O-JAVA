package empresa;

public class Funcionario {
	private String nome;
	private double salarioBase;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.isEmpty()) {
			System.out.println("O nome nao pode estar vazio!");
		} else{
			this.nome = nome;
		}
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		if(salarioBase < 0) {
			System.out.println("Salario nao pode ser negativo!");
		} else{
			this.salarioBase = salarioBase;
		}
	}
	
	public void calcularSalario() {
		System.out.println("Salário base: R$"+ salarioBase);
	}
}
