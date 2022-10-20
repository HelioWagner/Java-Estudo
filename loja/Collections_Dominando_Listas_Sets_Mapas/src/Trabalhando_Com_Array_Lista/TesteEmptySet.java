package Trabalhando_Com_Array_Lista;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {

	public static void main(String[] args) {
		Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo"); //o que acontece aqui?
	}

}
