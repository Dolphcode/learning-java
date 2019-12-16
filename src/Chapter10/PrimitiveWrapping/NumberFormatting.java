package Chapter10.PrimitiveWrapping;

import java.util.Date;
import java.util.Calendar;

public class NumberFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// let's say I wanted to format a number to have commas
		// So that something like 6000000 would become 6,000,000
		// You could use the static methods of the String class to format a number
		// Here's an example
		String s = String.format("%, d", 6000000);
		System.out.println(s);
		//The format method takes two arguments, the formatting instructions and what the formatting is being applied to
		// % means "insert argument here"
		// Format instructions looks like this:
		// %[argument number][flags][width][.precision]type
		// Arg Number - Specifies which argument if more than one is present
		// Flags - Special formatting features like adding the commas
		// Width - Minimum amount of characters used, if width of arg is smaller padding will be added
		// .Precision - Amount of decimal places allowed to show
		// Type - Mandatory, determines the type of number shown
		System.out.println(String.format("I have $%,8.2f", 568.3245));
		
		//Types:
		// %d stands for Decimal and only accepts anything compatible with "int" (Byte, Short, Int and Char)
		System.out.println(String.format("%d", 42));
		// %f stands for Floating Point and only accepts anything compatible with "float" (Float, Double, BigDecimal)
		System.out.println(String.format("%.2f", 42.000));
		// %x stands for Hexadecimal, must be Byte, Short, Integer, Long or BigInteger
		System.out.println(String.format("%x", 42));
		// %c stands for Character and gets the character a certain number represents
		System.out.println(String.format("%c", 42));
		
		// Multiple Arguments
		// Typically the formatting will follow the order of arguments
		double one = 231244124.542;
		double two = 34234235334234325.59752;
		System.out.println(String.format("You are %,.2f out of %,.1f", one, two));
		
		// Dates and Time
		Date now = new Date();
		// %tc returns complete date and time
		System.out.println(String.format("Date and time: %tc", now));
		// %tr returns the time
		System.out.println(String.format("Time: %tr", now));
		// %tA %tB %td returns day of week, month and day
		// The "<" flag says to use the previous argument
		System.out.println(String.format("Date: %tA, %<tB %<td", now));
		
		// Date and Time Manipulation
		// So java.util.Date is actually mostly deprecated, but hey! It's great for time stamps
		// Let's use java.util.Calendar instead
		// Okay so Calendar is actually abstract so we have to invoke a static method of Calendar
		// This method I speak of actually gets and instance of concrete Calendar subclass
		Calendar cal = Calendar.getInstance();
		// The code below sets the date
		cal.set(2004, 0, 7, 15, 40);
		System.out.println(cal.getTime());
		long day1 = cal.getTimeInMillis();
		day1 += 1000 * 60 * 60;
		// Add an hour's worth of milliseconds
		cal.setTimeInMillis(day1);
		System.out.println(cal.getTime());
		cal.add(cal.DATE, 35); // Adds 35 days to date
		System.out.println("Add 35 days: " + cal.getTime());
		cal.roll(cal.DATE, 35); // Rolls 35 days, keeps adding until end of month, then goes to start and adds from there
		System.out.println("Roll 35 days: " + cal.getTime());
		cal.set(cal.DATE, 1); // Set the date
		System.out.println("Set the date: " + cal.getTime());
	}

}
