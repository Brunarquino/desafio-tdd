package exercicio01;

import exceptions.AcaoAcelerarVeiculoInvalidaException;
import exceptions.NaoPodeDesligarVeiculoEmMovimentoException;
import exceptions.NaoPodeLigarVeiculoLigadoException;
import exceptions.VeiculoNoLimiteDoCombustivelException;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km ;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;
	
	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}
	
	public void acelerar() {
		if(!this.isLigado)
			throw new AcaoAcelerarVeiculoInvalidaException();
		else
			this.velocidade += 20;
	}
	
	public void abastecer(int litros) {
		
		if(this.litrosCombustivel <= 60) {
			int litrosNecessario = 60 - ( this.litrosCombustivel + litros );
			
			
			if(litrosNecessario < 0) {
				throw new VeiculoNoLimiteDoCombustivelException();
			}else
				litrosNecessario = litros;
			
			this.litrosCombustivel += litrosNecessario;
			
		}else {
			throw new VeiculoNoLimiteDoCombustivelException();
					
		}
	}
	
	public void frear() {
		if(!this.isLigado || this.velocidade == 0)
			throw new NullPointerException();
		else
			this.velocidade -= 20;
		
	}
	
	public void pintar(String cor) {
		
		if(cor.equals("") || cor.equals(null))
			throw new NullPointerException();
		else
			this.cor = cor;
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void desligar() {
		if(this.velocidade > 0)
			throw new NaoPodeDesligarVeiculoEmMovimentoException();
		else
			this.isLigado = false;
		
	}

	public void ligar() {
		if(this.isLigado)
			throw new NaoPodeLigarVeiculoLigadoException();
		else
			this.isLigado = true;
		
	}



	
}
