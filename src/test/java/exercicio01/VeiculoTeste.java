package exercicio01;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exceptions.AcaoAcelerarVeiculoInvalidaException;
import exceptions.NaoPodeDesligarVeiculoEmMovimentoException;
import exceptions.NaoPodeLigarVeiculoLigadoException;
import exceptions.VeiculoNoLimiteDoCombustivelException;

public class VeiculoTeste {
	
	Veiculo veiculo;
	
	@Before
	public void setup() {
		veiculo = 
				new Veiculo("Fiat", "Fiat Mobi", "HQW-5678", Cores.VERMELHO.getValor(), 0f, true, 10, 0, 67680);
	}
	
	@Test
	public void deveAcelerarVeiculo() {
		veiculo.acelerar();
		assertEquals(20, veiculo.getVelocidade());
	}
	
	@Test(expected=AcaoAcelerarVeiculoInvalidaException.class)
	public void deveTentarAcelerarCarroDesligado() {
		veiculo.desligar();
		veiculo.acelerar();
	}
	
	@Test
	public void deveAbastecerVeiculo() {
		veiculo.abastecer(10);
		assertEquals(20, veiculo.getLitrosCombustivel());
	}
	
	@Test(expected=VeiculoNoLimiteDoCombustivelException.class)
	public void deveAbastecerVeiculoNoLimite() {
		veiculo.abastecer(70);
	}
	
	
	@Test
	public void deveFrearVeiculo() {
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.frear();
		assertEquals(20, veiculo.getVelocidade());
	}
	
	
	@Test(expected=NullPointerException.class)
	public void deveTentarFrearVeiculoParado() {
		veiculo.frear();
	}
	
	
	@Test
	public void devePintarVeiculo() {
		veiculo.pintar(Cores.PRETO.getValor());
		assertEquals("Preto", veiculo.getCor());
	}
	
	@Test(expected=NullPointerException.class)
	public void deveTentarPintarVeiculoComEntradaVazia() {
		veiculo.pintar("");
		veiculo.pintar(null);
		assertEquals("Vermelho", veiculo.getCor());
	}
	
	
	@Test
	public void deveLigarVeiculo() {
		veiculo.desligar();
		veiculo.ligar();
		assertEquals(true, veiculo.isLigado());
	}
	
	@Test(expected=NaoPodeLigarVeiculoLigadoException.class)
	public void deveTentarLigarVeiculoDesligado() {
		veiculo.ligar();
	}
	
	@Test
	public void deveTentarLigarVeiculoLigado() {
		veiculo.desligar();
		assertEquals(false, veiculo.isLigado());
	}
	
	
	@Test(expected=NaoPodeDesligarVeiculoEmMovimentoException.class)
	public void deveTentarDesligarVeiculoEmMovimento() {
		veiculo.acelerar();
		veiculo.desligar();
	}
	
	
	

}
