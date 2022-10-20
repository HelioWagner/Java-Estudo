
//extendes está indicanto que herda os metodos e atriutos da classe conta
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		//super indica que está herdando o contrutor da classe mãe
		super(agencia, numero);
	}
	
	//indica que esrta fazendo reescrito o metodo da classe mãe override indica que veio da classe mãe
	@Override
	public boolean saca(double valor) {
		double ValorASacar = (valor + 0.2);
		return super.saca(ValorASacar);
	}

}
