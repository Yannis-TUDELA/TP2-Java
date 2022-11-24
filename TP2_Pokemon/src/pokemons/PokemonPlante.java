package pokemons;

public class PokemonPlante extends Pokemon {
	
	public PokemonPlante(String pNom) {
		super(pNom, TypePokemon.PLANTE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attaquer(Pokemon p) {
		this.subir(p);
		
	}

	@Override
	public void subir(Pokemon p) {
			// TODO Auto-generated method stub
			switch(p.getType()) {
			case FEU, PLANTE :
				System.out.println("Peu effficace");
				p.hp -= this.getAtk() * 0.5;
				break;
			case EAU : 
				System.out.println("Super efficace");
				p.hp -= this.getAtk() * 2;
				break;
			}
	}
}
