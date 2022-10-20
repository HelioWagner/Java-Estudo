package com.loiane.cursojava.execaula25_27;

public class Lampada {
	    String modelo;
	    String tensao;
	    int garantiaMeses;
	    int potencia;
	    String cor;
	    String tipoLuz;
	    String tipoAbajur;
	    String tipo[];
	    boolean ligada;	
	    
	    void desligarLampada() {
	    	System.out.println("Desligou a lampada");
	    }
	    
	    void ligarLampada() {
	    	System.out.println("Ligar a lampada");
	    }
	    
	    String acaoLampada(int Acao) {	    	
	    	if (Acao == 1) {
	    		return "Ligar";
	    	}	    	
	    	return "Desligar";	    	
	    	
	    }
	    
	    void ligar() {
	    	ligada = true;
	    }
	    
	    void desligar() {
	    	ligada = false;
	    }
	    
	    
	    
	    
	    
}
