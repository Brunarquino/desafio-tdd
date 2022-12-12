package exercicio03;

public enum Magias {
	
	TACAR_GELO("Tacar Gelo"),
	QUEBRA_DE_ENCANTOS("Quebra de Encantos"),
	RAIO_ELETRICO("Raio Eletrico"),
	MUTACAO("Mutação"),
	MANIPULACAO_DE_LUZ("Manipulação de Luz");
	
	
	private String valor;
	
	Magias(String valor){
		this.valor = valor;
	}
	
	public String getValor() {
		return this.valor;
	}
	

}
