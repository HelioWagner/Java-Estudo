
public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(111, 220);
		
		conta.deposita(200.0);
		conta.saca(200.0);
		
		System.out.println(conta.getSaldo());

	}

}
