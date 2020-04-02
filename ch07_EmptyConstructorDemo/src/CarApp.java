
public class CarApp {

	public static void main(String[] args) {
		// create an instance of car
		Car c1 = new Car();
		c1.setMake("VW");
		c1.setModel("GTI");
		c1.setYear(2018);
		c1.setMpg(22.5);
		Car c2 = new Car("Tesla", "Model Y", 2020, 300);
		c1.mpg = 25.0;  //can set this because variable is no longer private
						//we want these private so that other app can't directly modify our variables.
		
		
		// print its contents
		System.out.println(c1);
		System.out.println(c2);
	}

}
