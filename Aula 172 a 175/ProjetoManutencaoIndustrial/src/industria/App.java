package industria;

public class App {

	public static void main(String[] args) {
		Esteira e = new Esteira();
		RoboSolda rs = new RoboSolda();
		Tecnico t1 = new Tecnico();
		Tecnico t2 = new Tecnico();
		
		e.setNome("Esteira-norte-1");
		e.setCodigo("25aaa642");
		e.setStatus("Parada");
		e.setVelocidade(5);
		
		rs.setNome("RoboSolda444");
		rs.setCodigo("44rr44");
		rs.setStatus("Operando");
		rs.setQuantidadeEixos(6);
		
		t1.setNome("Amauri");
		t1.setMatricula("25oap131kef");
		t1.setEspecialidade("Operador de maquina");
		
		t2.setNome("Vinicius");
		t2.setMatricula("ooo333ooo");
		t2.setEspecialidade("Operador de maquina");
		
		OrdemManutencao om1 = new OrdemManutencao();
		
		OrdemManutencao om2 = new OrdemManutencao();
		
		om1.setMaquina(rs);
		om1.setDescricao("Teste1");
		om1.setNumero("557-42");
		om1.setTecnico(t1);
		
		om2.setTecnico(t2);
		om2.setMaquina(e);
		om2.setNumero("203-24");
		om2.setDescricao("Teste2");
		
		e.exibirDados();
		
		System.out.println("===================");
		
		rs.exibirDados();
		
		System.out.println("===================");
		e.realizarManutencao();
		System.out.println("===================");
		rs.realizarManutencao();
		System.out.println("===================");
		om1.exibirOrdem();
		System.out.println("===================");
		om2.exibirOrdem();

	}

}
