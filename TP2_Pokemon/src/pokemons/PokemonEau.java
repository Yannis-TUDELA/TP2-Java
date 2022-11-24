package pokemons;

public class PokemonEau extends Pokemon{

	public PokemonEau(String pNom) {
		super(pNom, TypePokemon.EAU);
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
		case EAU, PLANTE :
			System.out.println("Peu effficace");
			p.hp -= this.getAtk() * 0.5;
			break;
		case FEU : 
			System.out.println("Super efficace");
			p.hp -= this.getAtk() * 2;
			break;
		}
	}
}
