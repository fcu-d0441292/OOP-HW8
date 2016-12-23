package fcu.iecs.oop.pokemo;

public class Bulbasaur extends Pokemon implements Fightable{

	public Bulbasaur(String nickName, PokemonType type, int cp) {
		super(nickName, type, cp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("Aqua Tail");
		
	}
	
}
