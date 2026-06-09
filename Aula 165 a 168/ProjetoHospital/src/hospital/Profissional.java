package hospital;

public class Profissional {
	private String nome;
	private String registro;
	private String turno;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null) {
			System.out.println("O nome nao pode estar vazio!");
		} else {
			this.nome = nome;
		}
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		if(registro == null) {
			System.out.println("O registro nao pode estar vazio!");
		} else {
		    this.registro = registro;
	    }
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		if(turno == null) {
			System.out.println("O turno nao pode estar vazio!");
		} else {
			this.turno = turno;
		}
	}
	
	public void mostrarDadosBasicos() {
		System.out.println("Nome: "+ nome);
		System.out.println("Registro: "+ registro);
		System.out.println("Turno: "+ turno + "\n");
	}
	
}
