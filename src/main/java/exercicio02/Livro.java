package exercicio02;

public class Livro extends Produto{
	
	private String autor;
	private String tema;
	private int qtdPag;
	
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}
	
	@Override
	public double calcularImposto() {
		
		if(this.getPreco() < 0) {
			throw new PrecoProdutoInvalido();
		}else {
			if(!this.getTema().equals("educativo")) {
				return this.getPreco() * 0.10;
			}
			return 0;
		}
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", tema=" + tema + ", qtdPag=" + qtdPag + ", getNome()=" + getNome()
				+ ", getPreco()=" + getPreco() + ", getQtd()=" + getQtd() + "]";
	}
	
	

}
