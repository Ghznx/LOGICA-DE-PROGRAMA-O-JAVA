package redeSocial;

public class postagem {
	String texto;
	int curtidas;
	String autor;
	
	void mostrarPostagem() {
		System.out.println("Post: "+ texto);
		System.out.println("Curtidas: "+ curtidas);
		System.out.println("Autor: "+ autor+ "\n");
	}
}
