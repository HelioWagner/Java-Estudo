
public class TesteConexao {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao() ){
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro conexão");
		}
		
		
//     Exemplo 1 de try	  
//		Conexao con = null;
//	   try {
//		      con = new Conexao();
//		      con.leDados();
//		} catch (IllegalStateException e) {
//			  System.out.println("Deu erro na conexão");
//		} finally {
//		      con.fecha();
//		}
		
	}

}
