package com.loiane.cursojava.execaula25_27;

public class ContaCorrente {
    int numeroConta;
    double saldo;
    String statusConta = "Normal";
    double limiteCredito = 80.0;
   
    boolean Sacar(double valorSaque) {
    	
    	if (valorSaque <= saldo ) {
    		saldo = saldo - valorSaque;
    		return true;
    	}else {
    		if (valorSaque < limiteCredito) {
        		saldo = saldo - valorSaque;
        		statusConta  = "Especial";
        		return true;
        	}
    	} 
    	return false;
    	
    }
    
    boolean Depositar(double ValorDeposito) {
    	
    	if (ValorDeposito < 0) {
    		return false;
    	}
    	saldo += ValorDeposito;
    	return true;
    	
    }
    
    
}
