
public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        
        try {
        	  metodo1();
		} catch (ArithmeticException|NullPointerException e) {
			// String msg = e.getMessage();
			// System.out.println("Ini do metodo1"+msg);
			e.printStackTrace();
		}
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = 1 / 0;
            
//            try {
//				int a = 1 / 0;
//			} catch (Exception e) {
//				System.out.println("teste"+e);
//			}
            
//            try {
//				int a = 1 / 0;
//			} catch (ArithmeticException e) {
//				System.out.println("teste"+e.getMessage());
//			}
            
        }
        System.out.println("Fim do metodo2");
    }
}
