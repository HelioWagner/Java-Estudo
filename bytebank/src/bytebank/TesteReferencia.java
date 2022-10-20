package bytebank;

public class TesteReferencia {

	public static void main(String[] args) {
	
		Conta primeiraConta = new Conta();
		primeiraConta.agencia = 333;
		primeiraConta.saldo   = 500;		
		System.out.println("Saldo da primeira conta "+primeiraConta.saldo);		
		
		//quando receve uma classe ele assume a referencia classe anterior
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta "+segundaConta.saldo);
		
		
		if (segundaConta != primeiraConta) {
			System.out.println("Conta difente");
		} else {
			System.out.println("Conta igual");
		}
		
		

	}

}
