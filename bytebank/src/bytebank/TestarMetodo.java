package bytebank;

public class TestarMetodo {

	public static void main(String[] args) {
		
		    Conta contaDoPaulo = new Conta();
	        contaDoPaulo.saldo = 100;
	        contaDoPaulo.deposita(50);
	        System.out.println(contaDoPaulo.saldo); 

	        boolean conseguiuRetirar = contaDoPaulo.saca(20);
	        System.out.println(contaDoPaulo.saldo); 
	        System.out.println(conseguiuRetirar);

	        Conta contaDaMarcela = new Conta();
	        contaDaMarcela.deposita(1000);
		
		    boolean sucessoTranferencia = contaDaMarcela.transfere(50000, contaDoPaulo); 
		    		
		   if (sucessoTranferencia) {
			   System.out.println("Tranferência realizada com sucesso");
		   } else {
			   System.out.println("Saldo insuficiente"); 
		   }
		   System.out.println(contaDaMarcela.saldo);
		   System.out.println(contaDoPaulo.saldo);
	        
		

	}

}
