package industria;

public class OrdemManutencao {
	private String numero;
	private String descricao;
	private Maquina maquina;
	private Tecnico tecnico;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if(numero == null || numero.isEmpty()) {
			System.out.println("Numero invalido");
		}
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if(descricao == null || descricao.isEmpty()) {
			System.out.println("Descrição invalida!");
		}
		this.descricao = descricao;
	}
	public Maquina getMaquina() {
		return maquina;
	}
	public void setMaquina(Maquina maquina) {
		if(maquina == null) {
			System.out.println("Maquina invalida");
		} else{
			this.maquina = maquina;
		}
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		if(tecnico == null) {
			System.out.println("Tecnico invalido!");
		} else{
			this.tecnico = tecnico;
		}
	}
	
	public void exibirOrdem() {
		System.out.println("Numero da ordem: "+ numero);
		System.out.println("Descrição: "+ descricao);
		
		if(maquina != null) {
			System.out.println("Maquina: "+ maquina.getNome());
			System.out.println("Codigo da maquina: "+ maquina.getCodigo());
			System.out.println("Status da maquina: "+ maquina.getStatus());
		}
		
		if(tecnico != null) {
			System.out.println("Tecnico: "+ tecnico.getNome());
			System.out.println("Especialidade: "+ tecnico.getEspecialidade());
			System.out.println("Matricula: "+ tecnico.getMatricula());
		}
	}
}
