package hospital;

public class Consulta {
	private String paciente;
	private Profissional responsavel;
	
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		if(paciente.isEmpty()) {
			System.out.println("O nome nao pode estar vazio!");
		} else {
			this.paciente = paciente;
		}
	}
	public Profissional getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Profissional responsavel) {
		if(responsavel == null) {
			System.out.println("Reponsavel nao pode estar vazio!");
		} else {
			this.responsavel = responsavel;
		}
	}
	
	public void exibirResumoConsulta() {
		System.out.println("Paciente: "+ paciente);
		responsavel.mostrarDadosBasicos();
		
		if(responsavel instanceof Medico) {
			Medico medicoResponsavel = (Medico) responsavel;
			
			medicoResponsavel.exibirMedico();
		} else if(responsavel instanceof Enfermeiro) {
			Enfermeiro enfermeiroResponsavel = (Enfermeiro) responsavel;
			
			enfermeiroResponsavel.exibirEnfermeiro();
		}
	}
	
	
}
