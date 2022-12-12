package exercicio02;

public class VideoGame  extends Produto{

	
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	
	@Override
	public double calcularImposto() {
		
		if(this.getPreco() < 0) {
			throw new PrecoProdutoInvalido();
		}else {
			double imposto = 0.0;
			
			if(this.isUsado) {
				imposto = getPreco() * 0.25;
			}else {
				imposto = getPreco() * 0.45;
			}
			
			return imposto;
		}
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

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public String toString() {
		return "VideoGame [marca=" + marca + ", modelo=" + modelo + ", isUsado=" + isUsado + ", getNome()=" + getNome()
				+ ", getPreco()=" + getPreco() + ", getQtd()=" + getQtd() + "]";
	}
	
	
	
	
}
