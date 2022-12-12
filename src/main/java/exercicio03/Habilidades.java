package exercicio03;

public enum Habilidades {
	
	BATER_CABEÇA("Bater Cabeça"),
	TRAPACEAR("Trapacear"),
	COMBATE_TATICO("Combate Tatico"),
	MATADOR_DE_DAGRAO("Matador de dragao"),
	ATAQUE_DO_DRAGAO("Ataque do Dagrão");
	
	private String valor;
	
	Habilidades(String valor){
		this.valor = valor;
	}
	
	public String getValor() {
		return this.valor;
	}

}
