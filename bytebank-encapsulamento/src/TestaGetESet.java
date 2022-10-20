
public class TestaGetESet {

	public static void main(String[] args) {
	    Conta conta = new Conta(123,4444);
	    System.out.println("conta "+conta.getNumero());
	    
	    //instancia a classe 
	    Cliente helio = new Cliente();	    
	    conta.setTitular(helio);
	    
	    CidadeCliente cidade = new CidadeCliente();
	    helio.setCidade(cidade);
	    
	    conta.getTitular().setCpf("22622166818");
	    conta.getTitular().setNome("Helio wagner da silva");
	    conta.getTitular().setProfissao("Programador");
	    conta.getTitular().getCidade().setNome("Araçatuba");
	    
	    System.out.println("Nome "+conta.getTitular().getNome()+" Cidade: "+conta.getTitular().getCidade().getNome()
	    		           +conta.getAgencia());
	    
	    System.out.println(conta.getTitular().getCidade());
	    System.out.println(helio.getCidade());
	    
	     
	    Cliente titularDaConta = conta.getTitular();
	    titularDaConta.setProfissao("Programador");
	    
	    System.out.println(titularDaConta);
	   // System.out.println(helio);
	    System.out.println(conta.getTitular());
	    
	    Conta conta2 = new Conta(123,4444);
	    System.out.println(conta.getTotal());
	    
	    
	    
	    

	}

}
