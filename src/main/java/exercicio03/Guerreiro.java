package exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{
	
	private List<String> habilidade;
	private int numeroRandomico;

	public int getNumeroRandomico() {
		return numeroRandomico;
	}



	public Guerreiro(String nome, int vida, int mana, double xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		habilidade = new ArrayList<>();
	}
	
	

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}



	public void lvlUp() {
		
		super.setVida(getVida()+250);
		super.setMana(getMana()+50);
		super.setXp(getXp()+20);
		super.setInteligencia(getInteligencia()+50);
		super.setForca(getForca()+300);
		super.setLevel(getLevel()+1);
		
	}
	
	public int attack() {
		
		Random gerador = new Random();
		this.numeroRandomico = gerador.nextInt(300);
		return this.getForca() * getLevel();
		
	}



	public void aprenderHabilidade(String string) {
		if(string.equals("") || string.equals(null))
			throw new NullPointerException();
		else
			this.habilidade.add(string);
		
	}
	

}
