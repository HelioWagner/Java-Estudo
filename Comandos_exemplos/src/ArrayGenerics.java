
import java.util.ArrayList;

public class ArrayGenerics {

	public static void main(String[] args) {
		//definiçao do tipo do array no caso abaixo o array só aceita do tipo String
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Helio Wagner");
		nomes.add("Joao Wagner");
		
		System.out.println(nomes.get(0));
		
	}
}
