package clinica;
public class App {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente();
		Medico medico1 = new Medico();
		
		paciente1.setNome("Felipe");
		paciente1.setIdade(19);
		paciente1.setPeso(70);
		
		medico1.setNome("Matheus");
		medico1.setEspecialidade("Ortopedista");
		medico1.setValorConsulta(100.20);
		
		System.out.println("Paciente: "+ paciente1.getNome());
		System.out.println("Idade: "+ paciente1.getIdade());
		System.out.println("Peso: "+ paciente1.getPeso()+ "\n");
		
		System.out.println("Médico: "+medico1.getNome());
		System.out.println("Especialidade do medico: "+medico1.getEspecialidade());
		System.out.println("Valor da consulta: "+medico1.getValorConsulta());

	}

}
