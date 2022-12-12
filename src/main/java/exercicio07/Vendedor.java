package exercicio07;

public class Vendedor extends Funcionario{

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public double bonificacao() {
		if(this.getSalario() < 0)
			throw new IllegalArgumentException();
		else
			return this.getSalario() + 3000;
	}

}
