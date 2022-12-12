package exercicio03;

public abstract class Personagem {
	
	private String nome;
	private int vida;
	private int mana;
	private double xp;
	private int inteligencia;
	private int forca;
	private int level;
	private static int totalDePersonagens;
	
	public Personagem(String nome, int vida, int mana, double xp, int inteligencia, int forca, int level) {
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.xp = xp;
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.level = level;
		Personagem.totalDePersonagens++;
	}
	
	public static int getTotalDePersonagens() {
		return totalDePersonagens;
	}

	public static void setTotalDePersonagens(int totalDePersonagens) {
		Personagem.totalDePersonagens = totalDePersonagens;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public double getXp() {
		return xp;
	}
	public void setXp(double xp) {
		this.xp = xp;
	}
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
	

}
