
public class TestaCondicional2 {
	public static void main(String[] args) {
		
		System.out.println("testando condicionais");
		
		int idade = 16;
		int quantidaPessoas = 3;
		boolean acompanhado = quantidaPessoas >= 2;
		
		if(idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo");
		}
		else {
			System.out.println("infelizmente voc� n�o pode entrar");		
		}
	}
}
