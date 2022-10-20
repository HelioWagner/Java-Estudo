package com.loiane.cursojava.execaula25_27;

public class ContaCorrenteTeste {

	public static void main(String[] args) {
	
	    ContaCorrente helio = new ContaCorrente();
	    helio.Depositar(80);
	    boolean sacou = helio.Sacar(90);      
	    System.out.println("Saldo da Conta: "+helio.saldo);
	    System.out.println("Saldo da Conta: "+sacou);
	    System.out.println("Status da Conta: "+helio.statusConta);

	}

}
