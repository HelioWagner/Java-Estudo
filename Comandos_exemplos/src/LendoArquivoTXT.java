import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class LendoArquivoTXT {

	public static void main(String[] args) throws Exception {
		  //Fluxo de Entrada com Arquivo
        FileInputStream fis = new FileInputStream("C:\\Java\\Teclas Atalho.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        System.out.println(linha);
        


        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }
        //sempre tem que fechar arquivo de leitura
        br.close();

	}

}
