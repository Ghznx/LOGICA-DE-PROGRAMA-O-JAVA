package redeSocial;

public class comentario {
	String autor;
	String mensagem;
	int curtidas;
	
	void mostrarComentario() {
		System.out.println("Autor: "+ autor);
		System.out.println("Comentario: "+ mensagem);
		System.out.println("Curtidas: "+ curtidas+ "\n");
	}
}
