
public class Funcionario {
    
	//métodos
    private String Nome;
    private String Cpf;
    //filhos irão herdar esse metodo ou seja poderão usar
    //protected Double Salario;
    private double Salario;
    
    public double getBonificacao () {
		return (this.Salario * 0.1);  
	}    
    
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
