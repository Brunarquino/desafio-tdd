package exercicio04ao06;

import java.util.Iterator;
import java.util.List;

public class ListaPessoa {
	
	private List<Pessoa> pessoas;
	
	
	public String imprimirNomeDePessoaMaisVelha() {
		
		if(this.pessoas.isEmpty()) {
			throw new NullPointerException();
		} else {
			int maiorIdade = 0;
			String pessoaMaiorIdade = "";
			
			for(Pessoa pessoa: pessoas) {
				if(pessoa.getIdade() > maiorIdade) {
					maiorIdade = pessoa.getIdade();
					pessoaMaiorIdade = pessoa.getNome();
				}
			}
			
			return pessoaMaiorIdade;
		}
	}
	
	public void excluirMenoresDe18Anos() {
		this.pessoas.removeIf(pessoa -> pessoa.getIdade() < 18);
	}


	public int devolverIdadePessoa(String nome) {
		
		Integer idade = null;
		
		Iterator<Pessoa> itr = pessoas.iterator();
        while(itr.hasNext()) {
            Pessoa pe = itr.next();
            if (pe.getNome().contains(nome)){
                idade = pe.getIdade();
            }
        }
        
		if(!idade.equals(null)) {
			return idade;
		} else {
			throw new NullPointerException();
		}
		
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

}
