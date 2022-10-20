
public class SistemaInterno {
	
	private int senha = 222;
	
	public void autentica(Autenticavel fa) {
		
		boolean autenticou = fa.autentica(this.senha);
		
		if (autenticou) {
			System.out.println("Acesso no sistema liberado");
		} else {
			System.out.println("Senha incorreta, por favor verifique");
		}
		
		
	}

}
