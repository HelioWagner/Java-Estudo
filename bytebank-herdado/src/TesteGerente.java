
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marcus");
		g1.setCpf("2222222222");
		g1.setSalario(500.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		System.out.println(g1.getBonificacao());
		

	}

}
