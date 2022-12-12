package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Mago extends Personagem{
	
	private List<String> magia;

	public Mago(String nome, int vida, int mana, double xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.magia = new ArrayList<>();
	}
	
	
	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}


	public void lvlUp() {
		setVida(getVida()+100);
		setMana(getMana()+200);
		setXp(getXp()+ 20);
		setInteligencia(getInteligencia()+150);
		setForca(getForca()+50);
		setLevel(getLevel()+1);
	}


	public void aprenderMagia(String string) {
		if(string.equals("") || string.equals(null))
			throw new NullPointerException();
		else
			this.magia.add(string);
	}
	
	
}
