package Trabalhando_Com_Array_Lista;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {
	  
		    Set<String> alunos = new HashSet<>();
	        alunos.add("Paulo");
	        alunos.add("Alberto");
	        alunos.add("Pedro");    
	        alunos.add("Nico"); 
	        
	        
	      //  for (String alu : alunos) {
	//			System.out.println(alu);
		//	}
	        
	        //1) adicione alguns alunos
	        alunos.add("Helio");

	        //2) imprima o tamanho da colecao
	        System.out.println(alunos.size());

	        //3) tente adicionar um aluno que existe
	        alunos.add("Helio");

	        //4) imprima novamente o tamanho da colecao
	        System.out.println(alunos.size());
	        
	        boolean adicionou = alunos.add("Pedro");
	        System.out.println("Pedro foi adicionado ao Set? " + adicionou);
	        

	}

}
