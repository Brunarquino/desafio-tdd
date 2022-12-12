package exercicio02;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcularImpostoTeste {
	
	
	Livro livros;
	VideoGame videoGames;
	
	@Test
	public void deveRetornarImpostoNuloParaEducativo() {
		livros = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
		double imposto = livros.calcularImposto();
		assertEquals(0.0, imposto, 0.0001);
	}
	
	@Test
	public void deveRetornarImpostoDeLivroNaoEducativo() {
		livros = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		double imposto = livros.calcularImposto();
		assertEquals(6.0, imposto, 0.0001);
	}
	
	@Test(expected=PrecoProdutoInvalido.class)
	public void deveDarUmPrecoExeptionInvalido() {
		livros = new Livro("Senhor dos Anéis", -10, 30, "J. R. R. Tolkien", "fantasia", 500);
		livros.calcularImposto();
	}
	
	public void deveCalcularImpostoDeVideoGameUsado() {
		videoGames = new VideoGame("Ps4", 1000, 7, "Sony", "Slim", true);
	}
	
	public void deveCalcularImpostoDeVideoGameNovo() {
		videoGames = new VideoGame("Ps4", 1800, 100, "Sony", "Slim", false);
	}
	
	@Test(expected=PrecoProdutoInvalido.class)
	public void deveDarUmPrecoVideoGameExeptionInvalido() {
		videoGames = new VideoGame("Ps4", -10, 7, "Sony", "Slim", false);
		videoGames.calcularImposto();
	}
	

}
