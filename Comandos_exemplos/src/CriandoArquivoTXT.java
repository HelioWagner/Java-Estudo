import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class CriandoArquivoTXT {

	public static void main(String[] args) throws IOException {
		    //exemplo 1
		     OutputStream fos = new FileOutputStream("lorem2.txt");
	        Writer osw = new OutputStreamWriter(fos,StandardCharsets.UTF_8.name());
	        BufferedWriter bw = new BufferedWriter(osw);
        System.out.println(StandardCharsets.UTF_8.name());
	        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
	        bw.newLine();
	        bw.newLine();
	        bw.write("asfasdfsafdas dfs sdf asf assdß");

	        bw.close();
	        //exemplo2
	        FileWriter fw = new FileWriter("lorem3.txt");
	        fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
	        fw.write(System.lineSeparator());
	        fw.write(System.lineSeparator());
	        fw.write("asfasdfsafdas dfs sdf asf assdß");
	        fw.close();
	        
	        //exemplo 4 Correto, a classe PrintWriter tem métodos de mais alto nível
	        //que já cuidam da nova linha, independente do sistema operacional.
	        PrintWriter ps = new PrintWriter("lorem4.txt","UTF-8");
            ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
            ps.println();
            ps.println("asfasdfsafdas dfs sdf asf assdß");
            ps.close();
            
            //O método System.currentTimeMillis() devolve os milissegundos que passaram desde 1 de janeiro de 1970
            long ini = System.currentTimeMillis();

            BufferedWriter bw2 = new BufferedWriter(new FileWriter("lorem6.txt"));

            bw2.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
            bw2.newLine();
            bw2.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

            bw2.close();

            long fim = System.currentTimeMillis();

            System.out.println("Passaram " + (fim - ini) + " milissegundos");

	        

	}

}
