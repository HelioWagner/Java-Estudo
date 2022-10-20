package Trabalhando_Com_Array_Lista;

public class Aula implements Comparable<Aula> {
  ///Apertando CTRL + 3 e digitando gcuf 
	private String titulo;
	private int tempo;
	//construtor
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
    public int getTempo() {
		return tempo;
	}
	
    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.getTitulo());
    }
    
	
}
