
//extendes está indicanto que herda os metodos e atriutos da classe conta
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		//super indica que está herdando o contrutor da classe mãe
		super(agencia, numero);
	}
	
	//indica que esrta fazendo reescrito o metodo da classe mãe override indica que veio da classe mãe
	@Override
	public void saca(double valor) {
		double ValorASacar = (valor + 0.2);
		super.saca(ValorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

}
