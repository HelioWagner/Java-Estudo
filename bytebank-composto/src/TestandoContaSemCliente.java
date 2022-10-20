
public class TestandoContaSemCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta contaDaMarcela = new Conta();
		System.out.println(contaDaMarcela.pegaSaldo());
		
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela";
		System.out.println(contaDaMarcela.titular.nome);

	}

}
