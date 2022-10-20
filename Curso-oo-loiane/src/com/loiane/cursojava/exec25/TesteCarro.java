package com.loiane.cursojava.exec25;

public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println("marca: "+van.marca);
		van.exibirAutonomia();
		
		van.consumoCombustivel = 0.2+0.5;
		
		System.out.println("Total Autonomia: "+van.ObterAutonomia());
		
		double qtdeKM10 = van.CalcularCombustivel(10);
		double qtdeKM20 = van.CalcularCombustivel(20);
		
		System.out.println("qtdeKM10 "+qtdeKM10);
		

	}

}
