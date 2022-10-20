
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        
        try {
        	  metodo1();
		} catch (Exception e) {
			// String msg = e.getMessage();
			// System.out.println("Ini do metodo1"+msg);
			e.printStackTrace();
		}
        
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        //cirou execeções e não executa linha de código abaixo se colocar da erro
        throw new MinhaExcecao("Deu errado");
        //System.out.println("Fim do metodo2");
    }
}
