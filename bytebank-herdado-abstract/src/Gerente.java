
//Quando tenho a palavra extends indica heranca de uma outra classe no caso abaixo 
//gerente herdou do FuncionarioAutenticavel
public class Gerente extends Funcionario implements Autenticavel {    
	
		
	public double getBonificacao() {
		//a palavra super indica que o atributo vem da classe mae que no nosso caso seria a Funcionario.
		//super consigo chamar os metodos e atributos da classe mae
		return super.getSalario();
	}
	
    private AutenticacaoUtil autenticador;
	
	public Gerente() {
	  this.autenticador = new AutenticacaoUtil();	
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
    
}
