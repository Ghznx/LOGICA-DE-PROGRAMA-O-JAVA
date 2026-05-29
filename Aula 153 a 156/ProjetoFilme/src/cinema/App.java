package cinema;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Filme filme1 = new Filme();
		Filme filme2 = new Filme();
		Filme filme3 = new Filme();
		
		System.out.println("======Primeiro filme======");
		filme1.setTitulo("Shrek");
		filme1.setDuracao(90);
		filme1.setClassificacaoIndicativa(6);
		filme1.setNota(7.9);
		
		System.out.println("Titulo: "+ filme1.getTitulo());
		System.out.println("Duração: "+ filme1.getDuracao()+ " Minutos");
		System.out.println("Classificação: "+ filme1.getClassificacaoIndicativa()+ " Anos");
		System.out.println("Nota: "+ filme1.getNota() + "\n");
		
		System.out.println("======Segundo filme======");
		
		filme2.setTitulo("Pânico 7");
		filme2.setDuracao(114);
		filme2.setClassificacaoIndicativa(18);
		filme2.setNota(8.5);
		
		System.out.println("Titulo: "+ filme2.getTitulo());
		System.out.println("Duração: "+ filme2.getDuracao()+ " Minutos");
		System.out.println("Classificação: "+ filme2.getClassificacaoIndicativa()+ " Anos");
		System.out.println("Nota: "+ filme2.getNota());
		
		
		System.out.print("Informe o titulo: ");
		filme3.setTitulo(entrada.nextLine());
		System.out.print("Informe a duração(em minutos): ");
		filme3.setDuracao(entrada.nextInt());
		System.out.print("Informe a classificação etária: ");
		filme3.setClassificacaoIndicativa(entrada.nextInt());
		System.out.print("Informe a nota: ");
		filme3.setNota(entrada.nextDouble());
		
		System.out.println("======Terceiro filme======");
		
		System.out.println("Titulo: "+ filme3.getTitulo());
		System.out.println("Duração: "+ filme3.getDuracao()+ " Minutos");
		System.out.println("Classificação: "+ filme3.getClassificacaoIndicativa()+ " Anos");
		System.out.println("Nota: "+ filme3.getNota());

	}

}
