import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class OrdenandoLista {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisando as array list", 21);
		Aula a2 = new Aula("Lista de objetos",15);
		Aula a3 = new Aula("Relacionamento de lista de objetos",20);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		 // antes de ordenar:
        System.out.println(aulas);

        Collections.sort(aulas);

        // depois de ordenar:
        System.out.println(aulas);
        
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        aulas.sort(Comparator.comparing(Aula::getTempo));

	}

}
