package br.com.bytebank.banco.teste;
//tecla de atalho criar import CTRL+SHIFT+O
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

//import br.com.bytebank.banco.modelo.*;
/*a) Só pode ter uma declaração package por arquivo

b) A declaração do import é opcional

c) É possível repetir a declaração import para importações de packages diferentes

d) A definição da classe sempre deve vir por último (após package e import)*/


public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		int a = 3;
		int b = a / 0;
		
		
		ContaCorrente outra = null;
		outra.deposita(200.0); 
					
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());


	}

}
