package exercicio07;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FuncionariosTeste {
	
	Gerente gerente;
	Supervisor supervisor;
	Vendedor vendedor;
	
	@Before
	public void setup() {
		gerente = new Gerente("Liliane", 47, 12000);
		supervisor = new Supervisor("José", 56, 8500);
		vendedor = new Vendedor("Ana", 22, 4000);
	}
	
	@Test
	public void deveRetornarBonificacaoGerente() {
		double bonificacao = gerente.bonificacao();
		assertEquals(22000, bonificacao, 0.001);
	}
	
	@Test
	public void deveRetornarBonificacaoSupervisor() {
		double bonificacao = supervisor.bonificacao();
		assertEquals(13500, bonificacao, 0.001);
	}
	
	@Test
	public void deveRetornarBonificacaoVendedor() {
		double bonificacao = vendedor.bonificacao();
		assertEquals(7000, bonificacao, 0.001);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void deveTentarRetornarBonificacao() {
		gerente.setSalario(-10);
		supervisor.setSalario(-10);
		vendedor.setSalario(-10);
		
		gerente.bonificacao();
		supervisor.bonificacao();
		vendedor.bonificacao();
	}
	
	

}
