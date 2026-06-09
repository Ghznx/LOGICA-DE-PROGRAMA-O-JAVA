package empresa;

public class App {

	public static void main(String[] args) {
		Gerente gen = new Gerente();
		
		gen.setNome("Roberto");
		gen.setSalarioBase(3000);
		gen.setBonus(500);
		
		Desenvolvedor dev = new Desenvolvedor();
		
		dev.setNome("Daniele");
		dev.setSalarioBase(5000);
		dev.setHorasExtras(3);
		
		gen.calcularSalario();
		
		dev.calcularSalario();

	}

}
