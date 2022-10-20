
//abstract herança
//Uma classe abstrata representa um conceito, algo abstrato, e o 
//compilador não permite instanciar um objeto dessa classe. Para instanciar é preciso criar primeiro uma classe filha não abstrata.
public abstract class Funcionario {
    
	//métodos
    private String Nome;
    private String Cpf;
    //filhos irão herdar esse metodo ou seja poderão usar
    //protected Double Salario;
    private double Salario;
    //método sem corpo não há implementacao
    // um método abstrato define apenas a assinatura (visibilidade, retorno, nome do método e parâmetros).
    public abstract double getBonificacao ();
    
    
    
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		this.Cpf = cpf;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		this.Salario = salario;
	}
    
    
}
