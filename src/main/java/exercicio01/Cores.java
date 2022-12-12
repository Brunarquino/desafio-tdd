package exercicio01;

public enum Cores {
	
	PRETO("Preto"),
	BRANCO("Branco"),
	AZUL("Azul"),
	VERMELHO("Vermelho"),
	CINZA("Cinza");
	
	private String valor;
	
	Cores(String valor){
		this.valor = valor;
	}
	
	public String getValor() {
		return this.valor;
	}

}
