
public class AbstractCarsApp {

	public static void main(String[] args) {
		SportUtilityVehicle suv1 = new SportUtilityVehicle("Testla", "Model Y", 2020, 300, true, false);
		System.out.println(suv1);
		//Car c1 = new Car(); Can't do this now that Car is abstract
	}

}
