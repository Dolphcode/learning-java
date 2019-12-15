package Chapter10.MyMath;

//For this part of the book I'll try to recreate some functions in Math
public abstract class MyMath {
	
	//Behold the static method, Java is object oriented with exceptions
	//Static methods can be called without an object reference
	//To call the static method do "ClassName.method"
	/**
	 * Gets the absolute value of a number
	 * @param x - Is a double
	 * @return Returns the absolute value of x
	 */
	public static double abs(double x) {
		if (x >= 0) {
			return x;
		} else {
			return -x;
		}
	}
	
	/**
	 * @param x - is a double
	 * @return Returns x rounded to the nearest whole number
	 */
	public static double round(double x) {
		double y = x;
		double z;
		while (y > 1) {
			y--;
		}
		z = x - y;
		if (y >= 0.5) {
			return z + 1;
		} else {
			return z;
		}
	}
	
	/**
	 * @param x - is a double
	 * @return Returns x rounded down to the previous whole number
	 */
	public static double floor(double x) {
		double y = MyMath.round(x);
		if (y <= x) {
			return y;
		} else {
			return y - 1;
		}
	}
	
	/**
	 * @param x - is a double
	 * @return Returns x rounded up to the next whole number
	 */
	public static double ceil(double x) {
		double y = MyMath.round(x);
		if (y <= x) {
			return y + 1;
		} else {
			return y;
		}
	}
	
}
