
public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario helio = new Funcionario();
		helio.setNome("Helio Wagner da silva");
		helio.setCpf("2222222222");
		helio.setSalario(50.00);
		
		System.out.println("Nome: "+helio.getNome());
		System.out.println("Salario: "+helio.getBonificacao());
		
	}
}
