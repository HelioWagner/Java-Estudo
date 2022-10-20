
public class testarForBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         for (int i = 0; i < 3; i++) {
			
			System.out.println("erro"+i);
			
			 int contador = 0;			 
			 while (contador < 3) {
				 if (i == 2) {
					 System.out.println("Parou");
					 break;
				 }
				 
				 
				 contador ++;
			}
			
			
		}
		
	}

}
