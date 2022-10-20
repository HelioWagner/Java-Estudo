import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
        ////////////ordenando lista
		 String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
	        String curso2 = "Apache Camel";
	        String curso3 = "Certificação Java SE 8 Programmer I";

	        ArrayList<String> cursos = new ArrayList<>();
	        cursos.add(curso1);
	        cursos.add(curso2);
	        cursos.add(curso3);        

	        Collections.sort(cursos);

	        System.out.println(cursos);


	}



}
