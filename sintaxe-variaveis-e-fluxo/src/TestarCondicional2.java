
public class TestarCondicional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1 = 10;
		double nota2 = 10;
		double nota3 = 10;
		
		double totalNota = (nota1+nota2+nota3);		
		System.out.println("Total nota: "+totalNota);

		
		if (totalNota >= 30) {
			System.out.println((totalNota >= 30));
		}
		
		double mediaNota = (totalNota/3);
		//&& and - || - Or
		if (mediaNota == 10 && mediaNota >= 9 ) {
			System.out.println("Parabens vc foi aluno nota 10");
	    }
	}
}
