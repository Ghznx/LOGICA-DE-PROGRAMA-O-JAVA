package industria;

public class Empilhadeira extends Maquina{
	private boolean estado;
	
	public void levantarEmpilhadeira() {
		estado = true;
		System.out.println("Levantando empilhadeira");
	}
	
	public void descerEmpilhadeira() {
		estado = false;
		System.out.println("Baixando empilhadeira");
	}
}
