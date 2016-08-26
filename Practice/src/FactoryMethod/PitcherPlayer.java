package FactoryMethod;

public class PitcherPlayer extends Player {

	@Override
	public void batting_Ball() {
		System.out.println("뽈을 친다");
	}

	@Override
	public void throw_Ball() {
		System.out.println("뽈을 던진다");
	}

}
