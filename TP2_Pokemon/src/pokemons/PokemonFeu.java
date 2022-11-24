package pokemons;

public class PokemonFeu extends Pokemon {
	
	public PokemonFeu(String pNom) {
		super(pNom, TypePokemon.FEU);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attaquer(Pokemon p) {
		this.subir(p);
		
	}

	@Override
	public void subir(Pokemon p) {
		switch(p.getType()) {
		case FEU, EAU :
			System.out.println("Peu effficace");
			p.hp -= this.getAtk() * 0.5;
			break;
		case PLANTE : 
			System.out.println("Super efficace");
			p.hp -= this.getAtk() * 2;
			break;
		}
		
	}
}
