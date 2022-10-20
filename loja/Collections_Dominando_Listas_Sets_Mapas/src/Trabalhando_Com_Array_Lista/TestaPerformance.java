package Trabalhando_Com_Array_Lista;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		Collection<Integer> numeros = new ArrayList<Integer>();

        long inicio = System.currentTimeMillis();
        
        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        
        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: array " + tempoDeExecucao);
        
        
        
        Collection<Integer> numeros1 = new HashSet<Integer>();

        long inicio1 = System.currentTimeMillis();
        
        for (int i = 1; i <= 50000; i++) {
            numeros1.add(i);
        }

        for (Integer numero : numeros1) {
            numeros1.contains(numero);
        }
        
        long fim1 = System.currentTimeMillis();

        long tempoDeExecucao1 = fim1 - inicio1;

        System.out.println("Tempo gasto HashSet: " + tempoDeExecucao1);
        
        

	}

}
