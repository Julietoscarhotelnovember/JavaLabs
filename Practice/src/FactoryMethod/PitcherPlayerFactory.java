package FactoryMethod;

public class PitcherPlayerFactory extends PlayerFactory {
	public PitcherPlayerFactory(int age, String name) {

	}

	@Override
	protected Player createPlayer(int age, String name) {
		// TODO Auto-generated method stub
		PitcherPlayer p = new PitcherPlayer();
		p.setAge(age);
		p.setName(name);
		return p;
	}

	@Override
	public void registerKBO(Player p) {
		System.out.println("등록 나이: "+p.getAge());
		
	}

	@Override
	public void registerMLB(Player p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerNPB(Player p) {
		// TODO Auto-generated method stub
		
	}

}
