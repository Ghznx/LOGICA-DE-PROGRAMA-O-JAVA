package hospital;

public class Medico extends Profissional {
	private String especialidade;

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		if(especialidade == null) {
			System.out.println("A especialidade nao pode estar vazia!");
		} else {
			this.especialidade = especialidade;
		}
	}
	
	public void exibirMedico() {
		mostrarDadosBasicos();
		System.out.println("Especialidade: "+ especialidade);
	}
}
