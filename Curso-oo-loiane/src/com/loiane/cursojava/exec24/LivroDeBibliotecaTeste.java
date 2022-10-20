package com.loiane.cursojava.exec24;

import java.util.Date;

public class LivroDeBibliotecaTeste {

	public static void main(String[] args) {
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		livro.nome = "Use a Cabeça - Java";
		livro.dataEntrega = new Date();
		
		System.out.println(livro.nome);
		
	

	}

}
