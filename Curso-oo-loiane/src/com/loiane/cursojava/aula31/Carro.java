package com.loiane.cursojava.aula31;

public class Carro {
	///public da direito todas as classes externa ter acesso ao objeto
	//private apenas dentro da classe terá permissão
	//caso esteja sem a definição irá dar acesso apenas dentro do pacote de criação da classe
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	public void exibirAutonomia() {
	    System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " km");
	}
	
	public double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKMPorConsumoCombustive(double km){
		return km/this.consumoCombustivel;
	}
	
	public double calcularCombustivel(double km){
		
		return this.divideKMPorConsumoCombustive(km);
	}

}