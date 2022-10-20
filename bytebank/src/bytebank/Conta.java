package bytebank;

public class Conta {
   double saldo;
   int agencia;
   int numero;
   String titular;
   
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
   
  
  
}
