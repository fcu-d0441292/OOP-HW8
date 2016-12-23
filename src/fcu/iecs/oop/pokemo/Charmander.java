package fcu.iecs.oop.pokemo;

public class Charmander extends Pokemon implements Fightable{
	
	

	public Charmander(String nickName, PokemonType type, int cp) {
		super(nickName, type, cp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("Ember");
		// TODO Auto-generated method stub
		
	}

}
