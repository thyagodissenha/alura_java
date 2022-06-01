
public class Conexao implements AutoCloseable{
	public Conexao() {
		System.out.println("Abrindo conecao");
		//throw new IllegalStateException("Deu erro na conexao");
	}	
	public void leDados() {
		System.out.println("Recebendo dados");
		throw new IllegalStateException("Deu erro na conexao");
	}
	@Override
	public void close() {
		System.out.println("Fechando conexao");
	}
}
