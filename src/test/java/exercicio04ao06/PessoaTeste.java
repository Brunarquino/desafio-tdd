package exercicio04ao06;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class PessoaTeste {
	
	ListaPessoa listaPessoa;
	
	@Before
	public void setup() {
		listaPessoa = new ListaPessoa();
		
		listaPessoa.setPessoas(new ArrayList<>(Arrays.asList(
				new Pessoa("João", 15),
				new Pessoa("Leandro", 21),
				new Pessoa("Paulo", 17),
				new Pessoa("Jessica", 18)
				)));
		
	}
	
	@Test
	public void deveImprimirNomeDePessoaMaisVelha() {
		String nomePessoaMaisVelha = listaPessoa.imprimirNomeDePessoaMaisVelha();
		assertEquals("Leandro", nomePessoaMaisVelha);
		
	}
	
	@Test(expected=NullPointerException.class)
	public void deveTestarSeAListaEstaVazia() {
		listaPessoa.getPessoas().clear();
		listaPessoa.imprimirNomeDePessoaMaisVelha();
	}
	
	@Test
	public void deveExcluirMenoresDe18Anos() {
		listaPessoa.excluirMenoresDe18Anos();
		assertEquals(2, listaPessoa.getPessoas().size());
	}
	
	@Test
	public void deveDevolverAJessica() {
		int idadeJessica = listaPessoa.devolverIdadePessoa("Jessica");
		assertEquals(18, idadeJessica);
	}
	
	@Test(expected=NullPointerException.class)
	public void deveTentarDevolverAJessica() {
		listaPessoa.devolverIdadePessoa("Joaquina");
	}
	
	
	
}
