package industria;

public class Maquina {
	private String nome;
	private String codigo;
	private String status;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.isEmpty()) {
			System.out.println("Nome nao definido!");
		} else{
			this.nome = nome;
		}
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		if(codigo == null || codigo.isEmpty()) {
			System.out.println("Codigo nao definido!");
		} else{
			this.codigo = codigo;
		}
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		if(status != null && (status.equals("Operando") ||
		   status.equals("Parada") ||
		   status.equals("Em manutenção"))) {
			this.status = status;
		} else {
			System.out.println("Erro!");
		}
	}
	
	public void exibirDados() {
		System.out.println("Nome: "+ nome);
		System.out.println("Codigo: "+ codigo);
		System.out.println("Status: "+ status);
	}
	
	public void realizarManutencao() {
		System.out.println("Manutenção realizada!!");
	}
}
