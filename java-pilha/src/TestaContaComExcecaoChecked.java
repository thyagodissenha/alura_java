
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta c = new Conta();
		try {
			c.depositar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
