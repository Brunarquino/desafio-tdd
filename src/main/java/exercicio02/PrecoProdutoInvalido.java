package exercicio02;

public class PrecoProdutoInvalido extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Preço do produto Negativo";
	}

}
