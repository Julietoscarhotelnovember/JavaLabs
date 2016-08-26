package FactoryMethod;

public abstract class PlayerFactory {
	public final Player create(int age, String name) {
		Player p=createPlayer(age, name);
		registerKBO(p);
		registerMLB(p);
		registerNPB(p);
		return p;
	}

	protected abstract Player createPlayer(int age, String name);

	public abstract void registerKBO(Player p);

	public abstract void registerMLB(Player p);

	public abstract void registerNPB(Player p);
}
