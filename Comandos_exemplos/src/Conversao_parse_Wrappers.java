import java.util.ArrayList;
import java.util.List;

public class Conversao_parse_Wrappers {

	public static void main(String[] args) {
		//https://www.alura.com.br/artigos/converter-int-para-string-em-java
		
		 int idade = 29;
         Integer idadeRef = Integer.valueOf(29); //autoboxing
         System.out.println(idadeRef.doubleValue());

         System.out.println(Integer.MAX_VALUE);
         System.out.println(Integer.MIN_VALUE);

         System.out.println(Integer.SIZE);
         System.out.println(Integer.BYTES);

         int valor = idadeRef.intValue(); //unboxing
         String s = args[0];//"10"
         //Integer numero = Integer.valueOf(s);
         int numero = Integer.parseInt(s);
         System.out.println(numero);

         List<Integer> numeros = new ArrayList<Integer>();
         numeros.add(29); //Autoboxing
         
         //convertendo string para para integr
         int IntConv = 10;
         String valorS = Integer.toString(IntConv);         
        System.out.println(valorS);
        
        Integer IntConv3 = 10;
        String valorS3 = IntConv3.toString();         
       System.out.println(valorS);
        
        
      //convertendo string para para integer Correto e seria a opção mais adequada pois devolve um primitivo
        String diaComoTexto = "29";
        int dia = Integer.parseInt(diaComoTexto);
       System.out.println(dia);
        
      //convertendo string para inteiro 
        Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);
        
        //convertendo inteiro para string
        String refString = String.valueOf(10);
        refString += "nota";
        System.out.println(refString);
         
         
         
         
         
	}

}
