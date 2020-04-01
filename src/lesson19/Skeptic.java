package lesson19;

import java.util.Random;

public class Skeptic extends Person {

	Random random = new Random();
	
	public Skeptic(int x, int y, Country country) {
		super(x, y, country);
		// TODO Auto-generated constructor stub
	}

	public Skeptic() {
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public void tryToMove() {
		// TODO Auto-generated method stub
		super.tryToMoveRandomly();
	    }
}
