
public class Die {

	int die = 0;
	
	public void roll() {
		this.die = (int)(Math.random() * 6) + 1;
	}
	
	public int getValue() {
		return this.die;
	}
	
}
