package java8_Conheca_novidades_versao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import static java.util.Comparator.*;


public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
//       Consumer<String> consumidor = new Consumer<String>() {
//							@Override
//							public void accept(String t) {
//								System.out.println(t);
//								
//							}
//    	   
//       };
//		palavras.forEach((String s) -> {
//		    System.out.println(s);
//		});
		///lambda 
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		palavras.forEach(s -> System.out.println(s));
		
		///lambda 
		System.out.println("Imprime todos os elementos da lista!");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.forEach(n -> System.out.println(n));
		
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		Comparator<String> comparador = Comparator.comparing(s -> s.length());
		palavras.sort(comparador);
		
		
		Function<String, Integer> funcao = s -> s.length();
		Comparator<String> comparador2 = Comparator.comparing(funcao);
		palavras.sort(comparador2);
		
		
		///lambda
		palavras.sort(Comparator.comparing(s -> s.length()));
		//Fazemos uma referência ao método (method reference):
		palavras.sort(Comparator.comparing(String::length));
		
		
		palavras.sort(comparing(String::length));
		
		Function<String, Integer> funcao1 = s -> s.length();
		Function<String, Integer> funcao2 = String::length;
		
		palavras.forEach(System.out::println);
		
		
	}
	
	
	
	class ComparadorPorTamanho implements Comparator<String> {
		
		@Override
	    public int compare(String s1, String s2) {
	        if(s1.length() < s2.length()) 
	            return -1;
	        if(s1.length() > s2.length()) 
	            return 1;
	        return 0;
	    }
	}
	
}
