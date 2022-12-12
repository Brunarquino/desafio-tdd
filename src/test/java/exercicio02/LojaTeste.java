package exercicio02;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LojaTeste {
	
	Loja loja;
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream saida = System.out;
	
	@Before
	public void setup() {
		List<Livro> livros = new ArrayList<>();
		livros.add(new Livro("Harry Potter", 40, 50, "J. R. R. Tolkien", "fantasia", 300));
		livros.add(new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkien", "fantasia", 500));
		livros.add(new Livro("Java POO", 20, 50, "GFT", "educativo", 500));
		
		List<VideoGame> videoGames = new ArrayList<>();
		videoGames.add(new VideoGame("Ps4", 1800, 100, "Sony", "Slim", false));
		videoGames.add(new VideoGame("Ps4", 1000, 7, "Sony", "Slim", true));
		videoGames.add(new VideoGame("XBOX", 1500, 500, "Sony", "Slim", false));
		
		loja = new Loja("Americanas", "12345678", livros, videoGames);
		
	}
	
	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void restoreStreams() {
		System.setOut(saida);
	}
	
	
	@Test
	public void deveAdicionarLivrosNaLoja() {
		assertEquals(3, loja.getLivros().size());
	}
	
	@Test
	public void deveAdicionarVideosGamesNaLoja() {
		assertEquals(3, loja.getVideoGames().size());
	}
	

	@Test
	public void deveListarLivros() {
		
		String expectativa = 
				"Livro [autor=J. R. R. Tolkien, tema=fantasia, qtdPag=300, getNome()=Harry Potter, getPreco()=40.0, getQtd()=50]\r\n"
				+ "Livro [autor=J. R. R. Tolkien, tema=fantasia, qtdPag=500, getNome()=Senhor dos Anéis, getPreco()=60.0, getQtd()=30]\r\n"
				+ "Livro [autor=GFT, tema=educativo, qtdPag=500, getNome()=Java POO, getPreco()=20.0, getQtd()=50]\r\n";
		
		loja.listarLivros();
		assertEquals(expectativa, outContent.toString());
	}
	
	
	@Test
	public void deveListarVideosGames() {
		String expectativa = 
				"VideoGame [marca=Sony, modelo=Slim, isUsado=false, getNome()=Ps4, getPreco()=1800.0, getQtd()=100]\r\n"
				+ "VideoGame [marca=Sony, modelo=Slim, isUsado=true, getNome()=Ps4, getPreco()=1000.0, getQtd()=7]\r\n"
				+ "VideoGame [marca=Sony, modelo=Slim, isUsado=false, getNome()=XBOX, getPreco()=1500.0, getQtd()=500]\r\n";
		loja.listarVideoGames();
		assertEquals(expectativa, outContent.toString());
	}
	
	@Test(expected=ListaDeProdutosVazia.class)
	public void deveTestarListaVazia() {
		loja.getLivros().clear();
		loja.getVideoGames().clear();
		
		loja.listarLivros();
		loja.listarVideoGames();
	}
	
	
	
	@Test
	public void deveCalcularPatrimonio() {
		double patrimonio = loja.calcularPatrimonio();
		assertEquals(941800.0, patrimonio, 0.001);
	}

}
