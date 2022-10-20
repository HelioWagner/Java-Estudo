package com.loiane.cursojava.exec25;

public class Carro {
	  String marca;
	  String modelo;
	  int numPassageiros;
	  double capCombustivel;
	  double consumoCombustivel;
	  
	  //tipo de retorno void que significa que é um metodo sem retoro de dados
	  void exibirAutonomia () {
		  System.out.println("A autonomia do carro é: "+capCombustivel*consumoCombustivel);
	  }
	  
	  //double retorno
	  double ObterAutonomia() {
		  return (this.capCombustivel * this.consumoCombustivel);
	  }
	  
	  
	  double CalcularCombustivel(double Km) {
		  
		  double qtdCombustivel = (Km/consumoCombustivel);		  
		  return qtdCombustivel;
	  }
	  
	  
	  
}
