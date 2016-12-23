package fcu.iecs.oop.pokemo;

public abstract class Pokemon implements Fightable{
	private String nickName;
	private PokemonType type;
	private final int cp;
	public Pokemon(String nickName, PokemonType type, int cp) {
		super();
		this.nickName = nickName;
		this.type = type;
		this.cp = cp;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public PokemonType getType() {
		return type;
	}
	public void setType(PokemonType type) {
		this.type = type;
	}
	public int getCp() {
		return cp;
	}
	

	
}
