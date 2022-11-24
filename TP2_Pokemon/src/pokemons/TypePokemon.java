package pokemons;

public enum TypePokemon {
	FEU("Feu"), EAU("Eau"), PLANTE("Plante");
	private String name;
	
	private TypePokemon(String pName) {
		name = pName;
	}
	
	public String toString() {
		return name;
	}
}
