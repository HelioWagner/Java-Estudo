package com.loiane.cursojava.execaula25_27;

public class LampadaTeste {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		System.out.println("Status: "+ lampada.acaoLampada(1));		
		lampada.desligarLampada();
		
		lampada.ligar();
		System.out.println("lampada está: "+lampada.ligada);
		
		lampada.desligar();
		System.out.println("lampada está: "+lampada.ligada);
		
	}

}
