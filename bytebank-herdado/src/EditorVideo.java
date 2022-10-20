
//Quando tenho a palavra extends indica heranca de uma outra classe no caso abaixo 
//gerente herdou do funcionario
public class EditorVideo extends Funcionario {    
	
	public double getBonificacao() {
		//a palavra super indica que o atributo vem da classe mae que no nosso caso seria a Funcionario.
		//super consigo chamar os metodos e atributos da classe mae
		return super.getBonificacao()+ 100;
	}
    
}
