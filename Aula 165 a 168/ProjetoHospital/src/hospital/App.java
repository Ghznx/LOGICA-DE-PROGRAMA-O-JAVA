package hospital;

public class App {

	public static void main(String[] args) {
		Medico med = new Medico();
		
		med.setNome("Dr. Carlos Souza");
		med.setRegistro("CRM-12345");
		med.setTurno("Manhã");
		med.setEspecialidade("Cardiologia");
		
		Enfermeiro enf = new Enfermeiro();
		
		enf.setNome("Ana Lima");
		enf.setRegistro("COREN-67890");
		enf.setTurno("Noite");
		enf.setSetor("UTI");
		
		Consulta cons1 = new Consulta();
		
		cons1.setPaciente("Antonio");
		cons1.setResponsavel(med);
		
		cons1.exibirResumoConsulta();
		
		Consulta cons2 = new Consulta();
		
		cons2.setPaciente("Daniele");
		cons2.setResponsavel(enf);
		
		cons2.exibirResumoConsulta();
		

	}

}
