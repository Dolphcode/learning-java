package Chapter9.Duck;

public class DuckTester {
	
	public static void main(String[] args) {
		Duck duck1 = new Duck();
		Duck duck2 = new Duck(2, 20);
		Duck duck3 = new Duck("Barry");
		Duck duck4 = new Duck(3, 34, "Iggy");
		
		duck1.quack();
		duck2.quack();
		duck3.quack();
		duck4.quack();
	}
	
}
