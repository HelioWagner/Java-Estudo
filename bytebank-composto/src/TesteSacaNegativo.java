
public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println("Saldo da conta"+conta.pegaSaldo());
		conta.saca(50);
		System.out.println("Saldo apos saque"+conta.pegaSaldo());

	}

}
