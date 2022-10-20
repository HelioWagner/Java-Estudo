package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.agencia = 33006;
		primeiraConta.numero  = 324710;
		primeiraConta.saldo   = 50.55;
		primeiraConta.titular = "Helio Wagner da silva";		
		primeiraConta.saldo   += 50;		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;		 
		System.out.println(segundaConta.saldo+" "+segundaConta.titular);
		
	}

}
