package hospital;

public class Enfermeiro extends Profissional{
	private String setor;

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		if(setor == null) {
			System.out.println("O setor nao pode estar vazio!");
		} else {
			this.setor = setor;
		}
	}
	
	public void exibirEnfermeiro() {
		mostrarDadosBasicos();
		System.out.println("Setor: "+ setor);
	}
}
