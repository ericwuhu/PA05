package lesson19;

public class StayAtHomeIfSick extends Person{


	public StayAtHomeIfSick() {
		super();
	}

	public void tryToMove() {
		super.tryToMoveRandomly();
    //if (!this.infected){
      //super.tryToMove();
    //}
	}

}
