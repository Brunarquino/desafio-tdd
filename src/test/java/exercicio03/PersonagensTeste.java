package exercicio03;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PersonagensTeste {
	
	Mago mago;
	Guerreiro guerreiro;
	
	@Before
	public void setup() {
		Personagem.setTotalDePersonagens(0);
		mago = new Mago("Anivia", 100, 300, 0, 400, 50, 1);
		guerreiro = new Guerreiro("Sett", 500, 50, 0, 100, 300, 1);
		
	}
	

	@Test
	public void deveTestarUpgradeAtributosDoMago() {
		
		mago.lvlUp();
		assertEquals(500, mago.getMana());
		assertEquals(20.0, mago.getXp(), 0.0001);
		assertEquals(550, mago.getInteligencia());
		assertEquals(2, mago.getLevel());
		assertEquals(200, mago.getVida());
		assertEquals(100, mago.getForca());
		
			
	}
	
	@Test
	public void deveTestarUpgradeAtributosDoGuerreiro() {
		
		guerreiro.lvlUp();
		assertEquals(750, guerreiro.getVida());
		assertEquals(100, guerreiro.getMana());
		assertEquals(20.0, guerreiro.getXp(), 0.0001);
		assertEquals(150, guerreiro.getInteligencia());
		assertEquals(2, guerreiro.getLevel());
		assertEquals(600, guerreiro.getForca());
	
	}
	
	
	@Test
	public void deveAprenderMagia() {
		
		mago.aprenderMagia(Magias.TACAR_GELO.getValor());
		assertEquals(1, mago.getMagia().size());
		
	}

	@Test
	public void deveAprenderHabilidade() {
		guerreiro.aprenderHabilidade(Habilidades.BATER_CABEÇA.getValor());
		assertEquals(1, guerreiro.getHabilidade().size());
	}
	
	@Test(expected = NullPointerException.class)
	public void naoDeveAceitarNulo() {
		mago.aprenderMagia("");
		mago.aprenderMagia(null);
		guerreiro.aprenderHabilidade("");
		guerreiro.aprenderHabilidade(null);
	}

	
	//TODO quantidadeDePersonagens
	@Test
	public void deveMostrarAQuantidadeDePersonagens() {
		assertEquals(2, Personagem.getTotalDePersonagens());
	}
	
}
