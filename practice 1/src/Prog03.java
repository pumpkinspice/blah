// APCS1 Lab Test 1
//
// Prog03.java
//
// Math Methods
//
// Points: 3
//
////////////////////////////////////////////////////////////////////////////////
// Complete this program so that it will compute and display the following:
// 1) The square root of (x + y)
// 2) The absolute value of (y - x)
// 3) x to the power of y
// 4) y to the power of x
// 5) The larger of x and y
// 6) the smaller of x and y
// 7) x rounded up
// 8) y rounded down
// 9) (x * y) rounded to the nearest integer
//
//
////////////////////////////////////////////////////////////////////////////////
// NOTE: The first line is done for you.
//
// Remember: No hard-coding of the answers!



public class Prog03
{
	public static void main (String args[])
	{
		double x = 12.45;
		double y = 3.6789;
		System.out.println("Square Root: " + Math.sqrt(x+y));
		System.out.println("Absolute value: " + Math.abs(y-x));
		System.out.println("x to the power of y: " + Math.pow(x, y));
		System.out.println("y to the power of x: " + Math.pow(y, x));
		System.out.println("The larger of x and y: " + Math.max(x,y));
		System.out.println("The smaller of x and y: " + Math.min(x, y));
		System.out.println("x rounded up: " + Math.ceil(x));
		System.out.println("y rounded down: " +Math.floor(y));
		System.out.println("x and why multiplied to the nearest integer: " + Math.rint(x*y));
		
		
		
		





	}
}

 

