package Trabalhando_Com_Array_Lista;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class TestaCurso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");
		
		  javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
	        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
	        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

	        // tentando adicionar da maneira "antiga". Podemos fazer isso? Teste:
	        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));

	     //   System.out.println(javaColecoes.getAulas());
       
	}

}
