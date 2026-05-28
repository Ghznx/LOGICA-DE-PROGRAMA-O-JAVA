package redeSocial;

public class App {

	public static void main(String[] args) {
		usuario user1 = new usuario();
		
		user1.nome = "Ana";
		user1.idade = 17;
		user1.cidade = "Valença";
		
		user1.mostrarPerfil();
		
		postagem post1 = new postagem();
		
		post1.texto = "Estudando Java hoje!";
		post1.curtidas = 15;
		post1.autor = "Ana";
		
		post1.mostrarPostagem();
		
		comentario comentario1 = new comentario();
		
		comentario1.autor = "Bruno";
		comentario1.mensagem = "Muito bom esse post!";
		comentario1.curtidas = 4;
		
		comentario1.mostrarComentario();
		
		mensagemPrivada mensagem1 = new mensagemPrivada();
		
		mensagem1.remetente = "Ana";
		mensagem1.destinatario = "Carlos";
		mensagem1.conteudo = "Oi, tudo bem?";
		
		mensagem1.mostrarMensagem();
		
		grupo grupo1 = new grupo();
		
		grupo1.nomeGrupo = "Amigos do Java";
		grupo1.tema = "Programação";
		grupo1.quantidadeMembros = 28;
		
		grupo1.mostrarGrupo();
		
	}

}
