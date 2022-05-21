
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		
		int idade = 16;
		int quantidaPessoas = 3;
		boolean acompanhado;
		
		if(quantidaPessoas >= 2) {
			acompanhado = true;
		}
		else {
			acompanhado = false;
		}
		
		if(idade >= 18 || acompanhado) {
			System.out.println("seja bem vindo");
		}
		else {
			System.out.println("infelizmente você não pode entrar");		
		}
	}
}
