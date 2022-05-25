
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(senha);
		if(autenticou) {
			System.out.println("Pode entrar no systema");
		} else {
			System.out.println("Não pode entrar no systema");
		}
	}
}
