package fcu.iecs.oop.pokemo;

public class Psyduck extends Pokemon implements Fightable{

	public Psyduck(String nickName, PokemonType type, int cp) {
		super(nickName, type, cp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.println("Tackle");
		// TODO Auto-generated method stub
		
	}

}
