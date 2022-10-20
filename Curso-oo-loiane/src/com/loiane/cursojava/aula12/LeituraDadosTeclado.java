package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Digite seu nome completo");
//		String nomeCompleto = scan.nextLine();
//		System.out.println("Seu nome compleo é: "+nomeCompleto);
		
		System.out.println("Digite sua idade");
		int altura = scan.nextInt();
		System.out.println("Seu nome compleo é: "+altura);

	}

}
