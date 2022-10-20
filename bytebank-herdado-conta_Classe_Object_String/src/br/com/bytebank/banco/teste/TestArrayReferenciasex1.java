package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestArrayReferenciasex1 {

	public static void main(String[] args) {
		 //int[] idades = new int[5];
		//criou array conta do tipo contacorrente
        ContaCorrente[] contas = new ContaCorrente[5];
        //criando a classe contacorrente
        ContaCorrente cc1 = new ContaCorrente(22, 11);
        //atribuindo para o array conta do tipo conta corrente
        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(22, 22);
        contas[1] = cc2;

        //System.out.println(cc2.getNumero());

        System.out.println(contas[1].getNumero());

        ContaCorrente ref = contas[1];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());

	}

}
