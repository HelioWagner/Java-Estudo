
public class TestarCondicionais {

	public static void main(String[] args) {
		int idade = 16;
		int quantidadePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Voce tem idade maior que 18 anos");
			System.out.println("Seja bem vindo");
		}
	    else if (quantidadePessoas > 1) {
	      System.out.println("Você não tem idade para entrar mais está acompanhado");	
		} else {
          System.out.println("Infelizmente você não pode entrar");         
		}

	}

}
