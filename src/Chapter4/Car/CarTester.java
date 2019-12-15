package Chapter4.Car;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car myCar = new Car();

        //You cannot do this below
        //myCar.color = "Red"
        //Instead you must do:
        myCar.setColor("Red");
        myCar.setMileage(12321);
        myCar.setBrand("Honda");

        System.out.println("Car brand: " + myCar.getBrand());
        System.out.println("Car mileage: " + myCar.getMileage() + "mi.");
        System.out.println("Car color: " + myCar.getColor());
	}

}
