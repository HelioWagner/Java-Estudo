package com.loiane.cursojava.exec24;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		lampada.modelo  = "A60";
		lampada.tensao  = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		//sempre que temos um array temos que instancia pra poder usar
		lampada.tipo = new String[5];
		lampada.tipo[0] = "Abajur";
		
		System.out.println("Modelo"+lampada.modelo+" tipo: "+lampada.tipo[0]);

	}

}
