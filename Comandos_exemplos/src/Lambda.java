import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambda {

	public static void main(String[] args) {
		///lambda 
//		/https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826
		//https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

		
		       System.out.println("Imprime todos os elementos da lista!");
				List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
				list1.forEach(n -> System.out.println(n));
				
				
				 System.out.println("Cria a lista com os elementos que serão realizadas operações");
			        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

			        System.out.println("Imprime todos os números:");
			        avaliaExpressao(list, (n)->true);

			        System.out.println("Não imprime nenhum número:");
			        avaliaExpressao(list, (n)->false);

			        System.out.println("Imprime apenas número pares:");
			        avaliaExpressao(list, (n)-> n%2 == 0 );

			        System.out.println("Imprime apenas números impares:");
			        avaliaExpressao(list, (n)-> n%2 == 1 );

			        System.out.println("Imprime apenas números maiores que 5:");
			        avaliaExpressao(list, (n)-> n > 5 );

			  System.out.println("Imprime apenas números maiores que 5 e menores que 10:");
			        avaliaExpressao(list, (n)-> n > 5 && n < 10);
			        
			        new Thread(new Runnable() {

			            @Override
			            public void run() {
			                System.out.println("Executando um Runnable");
			            }

			        }).start();
			        
			        new Thread(() -> System.out.println("Executando um Runnable")).start();

	}
	
	
	public static void avaliaExpressao(List<Integer> list, Predicate<Integer> predicate) {
        list.forEach(n -> {
          if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        });
    }

}
