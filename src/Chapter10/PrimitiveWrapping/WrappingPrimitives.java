package Chapter10.PrimitiveWrapping;
import java.util.ArrayList;

public class WrappingPrimitives {
	
	public static void main(String[] args) {
		// So you may have seen the Integer object before in ArrayLists perhaps
		int x = 32;
		ArrayList<Integer> xList = new ArrayList<Integer>();
		// Before the following line of code didn't work because you had to wrap primitives
		xList.add(x);
		// Apparently it does not
		
		// So here are some other primitive variables as object references
		Boolean a = true;
		Character b = 'b';
		Byte c = 14;
		Short d = 25;
		Integer e = 4;
		Long f = 23L;
		Float g = 6.5F;
		Double h = 7.7;
		
		// You can substitute compatible references for places that expect primitives
		// And vice versa
		if (x > e) {
			System.out.println("See what I mean");
		}
		
		WrappingPrimitives wp = new WrappingPrimitives();
		System.out.println(wp.seeWhatIMean(e) + " am I right?");
		System.out.println(wp.seeWhatIMean2(a));
		
		//Alright alright I'll stop using int
		char r = 'y';
		System.out.println(b);
		b = r;
		System.out.println(b);
		
		//This might look weird but it works, the compiler just turns the object reference back to its corresponding primitive
		System.out.println(f);
		f++;
		System.out.println(f);
		
		//Wrappers have static utility methods too!
		//Things like parseint, parseshort, parsedouble, e.t.c. convert strings containing numbers into a numeric type
		String u = "5";
		System.out.println(d);
		d = Short.parseShort(u);
		System.out.println(d);
		
		//You can also go from number to string
		System.out.println(u);
		u = Byte.toString(c);
		System.out.println(u);
	}
	
	public Integer seeWhatIMean(int z) {
		return z;
	}
	
	public boolean seeWhatIMean2(boolean h) {
		return h;
	}
	
}
