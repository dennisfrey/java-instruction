
public class Dice {

	Die die1 = new Die();
	Die die2 = new Die();
	
	public int getDie1Value() {
		return die1.getValue();
	}
	
	public int getDie2Value() {
		return die2.getValue();
	}
	
	public int getSum() {
		return (die1.getValue() + die2.getValue());
	}
	
	public void roll() {
		die1.roll();
		die2.roll();
	}
	public void printRoll() {
		System.out.println("\nDie 1: "+ die1.getValue());
		System.out.println("Die 2: "+ die2.getValue());
		System.out.println("Total: "+ (die1.getValue() + die2.getValue()));
			
	}
	
}
