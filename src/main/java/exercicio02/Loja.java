package exercicio02;

import java.util.List;

public class Loja {
	
	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}
	
	public void listarLivros() {
		
		if(this.livros.isEmpty())
			throw new ListaDeProdutosVazia();
		else 
			this.livros.forEach(livro -> System.out.println(livro));
	}
	
	public void listarVideoGames() {
		if(this.videoGames.isEmpty())
			throw new ListaDeProdutosVazia();
		else 
			this.videoGames.forEach(games -> System.out.println(games));
	}
	
	
	public double calcularPatrimonio() {
		double livros = 0.0, videosGames = 0.0;
		
		livros = this.livros.stream().mapToDouble(livro -> livro.getPreco() * livro.getQtd()).sum();
		videosGames = this.videoGames.stream().mapToDouble(game -> game.getPreco() * game.getQtd()).sum();
		
		return  livros + videosGames;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}




	

}
