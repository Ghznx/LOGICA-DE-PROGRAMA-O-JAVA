package industria;

public class Tecnico {
	private String nome;
	private String matricula;
	private String especialidade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.isEmpty()) {
			System.out.println("Nome invalido!");
		} else{
			this.nome = nome;
		}
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		if(matricula == null || matricula.isEmpty()) {
			System.out.println("Matricula invalida!");
		} else{
			this.matricula = matricula;
		}
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		if(especialidade == null || especialidade.isEmpty()) {
			System.out.println("Especialidade invalida!");
		} else{
			this.especialidade = especialidade;
		}
	}
	
	
}
