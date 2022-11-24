package pokemons;

import java.util.Random;

public abstract class Pokemon {
	private String nom;
	private int niveau;
	protected int hp;
	private int atk;
	private TypePokemon type;
	
	private static Random r = new Random(); //static pour partager l'instance et pas pour créer chaque fois une instance pour chaque objet
	private static final int niveauMax = 10;
	
	public Pokemon(String pNom, TypePokemon pType) {
		this.nom = pNom;
		this.niveau = r.nextInt(1,niveauMax+1);
		this.hp = 2*this.niveau;
		this.atk = (this.niveau/2)+1;
		this.type = pType;
	}

	public String getNom() {
		return nom;
	}

	public int getNiveau() {
		return niveau;
	}

	public int getHp() {
		return hp;
	}

	public int getAtk() {
		return atk;
	}

	public static int getNiveaumax() {
		return niveauMax;
	}
	
	public TypePokemon getType() {
		return type;
	}
	
	public boolean isKO() {
		return this.hp == 0;
	}
	
	public void soigner() {
		this.hp = 2*this.niveau;
	}
	
//	public void attaquer(Pokemon p) {
//		log("J'attaque " + p.nom);
//		p.hp -= this.atk;
//	}
	
	public abstract void attaquer(Pokemon p);
	public abstract void subir(Pokemon p);
	
	public String toString() {
		return "Je m'appelle " + this.nom + " je suis au niveau " + this.niveau + " j'ai " + this.hp + " points de vie et mon attaque de base est de " + this.atk + "\n\t Je suis de type " + this.type; 
	}
	
	private String prefixe() {
		return "[Pokemon " + this.nom + "]";
	}
	
	public void log(String msg) {
		System.out.println(prefixe() + msg);
	}


}
