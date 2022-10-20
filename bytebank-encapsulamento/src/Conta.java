

public class Conta {
   //private na variavel indica que só pode ser usando dentro da classe   
	//atributos
   private double saldo;
   private int agencia;
   private int numero;
   private Cliente titular;
   //quando o atributo tem a palavra static seria como se fosse uma variavel global
   //se torna propriedade da classe
   private static int total;
   
   
    
   //construtor iniciado na criação da classe pode realizar validação
   //uma vez usado o construtor precisa sempre se informado os campo de inicialização
   public Conta(int agencia, int numero) {
	 this.agencia = agencia;
	 this.numero = numero;
	 total++;
   }

//public indica que o método é publico e pode chamar qualquer lugar
   //Void indica que o método não terá retorno
   public void deposita(double valor) {	    
	   this.saldo += valor;
   }
   
   public boolean saca(double valor) {
	   
	   if (this.saldo >= valor) {
		   this.saldo = this.saldo - valor;
		   return true;
	   }else {
		   return false;   
	   }
   }
   
   public boolean transfere(double valor, Conta destino) {
	   
	   if (this.saldo >= valor) {
		   this.saldo -= valor;
		   destino.deposita(valor);
		   return true;
	   }
	   return false;
   }
   
   public double pegaSaldo() {
	   return this.saldo;
   }
   
   public int getNumero() {
      return this.numero;
   }
   
   public void setNumero(int numero) {
	 if (numero <= 0 ) {
	    System.out.println("Não pode ser informado valores menor que ZERO");
		return;
     }  
	   
	 this.numero = numero;
   }

	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0 ) {
			System.out.println("Não pode ser informado valores menor que ZERO");
			return;
		}
		this.agencia = agencia;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	//quando a classe tem a palavra static indica que é um metodo geral da classe
	public static int getTotal() {
		return Conta.total;
	}
  
   
   
}
