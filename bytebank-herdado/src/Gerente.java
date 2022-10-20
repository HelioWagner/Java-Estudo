
//Quando tenho a palavra extends indica heranca de uma outra classe no caso abaixo 
//gerente herdou do funcionario
public class Gerente extends Funcionario {    
	
	//métodos
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {
		//a palavra super indica que o atributo vem da classe mae que no nosso caso seria a Funcionario.
		//super consigo chamar os metodos e atributos da classe mae
		return super.getBonificacao()+ super.getSalario();
	}
    
}
