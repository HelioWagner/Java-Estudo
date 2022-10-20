
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Arrays {   
   //https://www.devmedia.com.br/diferenca-entre-arraylist-vector-e-linkedlist-em-java/29162
	public static void main(String[] args) {
		  //exemplos declarar array
		   String palavras[] = new String[9];
		   int[] paginas = new int[] {1,2,3,4,5};
		   boolean[] confirmacoes = {false,true,false,false,true};

            int[]idades = new int[5]; //inicializa o array com os valores padroes

            idades[0] = 29;
            idades[1] = 39;
            idades[2] = 49;
            idades[3] = 59;
            idades[4] = 69;

            int idade1 = idades[4];

            System.out.println(idade1);

            System.out.println(idades.length);
            //array literal   
            int[] refs = {1,2,3,4,5,6,7};
            
            System.out.println(refs.length);
            
            //arrays criado pela classe java.util.ArrayList
            ArrayList lista = new ArrayList();
            lista.add(10);
            
            System.out.println("tamanho: "+lista.size());
            
            
            //Lista a partir de outra
            //Outra forma de inicializar uma lista é baseado na outra que é muito comum no dia a dia. 
            //Para tal a ArrayList possui mais um construtor que recebe a lista base:
            ArrayList lista3 = new ArrayList(26); //capacidade inicial
            lista3.add("RJ");
            lista3.add("SP");
            //outros estados
            ArrayList nova = new ArrayList(lista3); //criando baseado na primeira lista
            
            
         // creating an Empty Integer List
            List<Integer> arr = new ArrayList<Integer>(4);
      
            // using add() to initialize values
            // [1, 2, 3, 4]
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
      
            // use contains() to check if the element
            // 2 exits or not
            boolean ans = arr.contains(2);
      
            if (ans)
                System.out.println("The list contains 2");
            else
                System.out.println("The list does not contains 2");
      
            // use contains() to check if the element
            // 5 exits or not
            ans = arr.contains(5);
      
            if (ans)
                System.out.println("The list contains 5");
            else
                System.out.println("The list does not contains 5");
            
            
            ///link list
            //Generics
            LinkedList<Integer> lista9 = new LinkedList<Integer>();
            
            
            List<String> nome = new ArrayList<String>();
            nome.add("Hélio");
            nome.add("Joao");
            nome.add("Juca");
            
            System.out.println(nome);
            
            nome.remove(1);
            
            System.out.println(nome);
            
            
            String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
            String curso2 = "Apache Camel";
            String curso3 = "Certificacao Java SE 8 Programmer I";

            ArrayList<String> cursos = new ArrayList<>();
            cursos.add(curso1);
            cursos.add(curso2);
            cursos.add(curso3);        
            System.out.println("tamanho:"+cursos.size());
            for (int i = 0; i < cursos.size(); i++) {
                System.out.println("Aula : " + cursos.get(i));
            }

            ////////////ordenando lista
            String curso11 = "Java 8: Tire proveito dos novos recursos da linguagem";
            String curso21 = "Apache Camel";
            String curso31 = "Certificação Java SE 8 Programmer I";

            ArrayList<String> cursos1 = new ArrayList<>();
            cursos.add(curso11);
            cursos.add(curso21);
            cursos.add(curso31);        

            Collections.sort(cursos1);

            System.out.println(cursos1);

            

	}

}
