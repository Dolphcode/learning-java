package Chapter10.MyMath;

public class MathTester {
	
	//Inside here are all static method calls
	//Static methods can be called anywhere but non-static methods cannot be called in static methods
	//The same thing applies for variables, only static variables can be used in static methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MyMath.abs(-5.0));
		System.out.println(MyMath.abs(5.0));
		System.out.println(MyMath.round(5.5));
		System.out.println(MyMath.round(5.51));
		System.out.println(MyMath.round(5.49));
		System.out.println(MyMath.floor(5.5));
		System.out.println(MyMath.ceil(5.4));
	}

}
