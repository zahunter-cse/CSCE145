// Zy'Nasia Hunter

import java.util.Scanner; 
public class Lab02 {
	public static final double a = 9.8; // constant variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner key = new Scanner(System.in); // creating a new instance of keyboard
		System.out.println("Enter a value for t");
		
		double t = key.nextDouble(); // creating a new double variable (what user knows)
		
		System.out.println("Enter a value for u");
		double u = key.nextDouble();
		// I'm using double to declare a variable
	
		System.out.println(u*t+.5*a*Math.pow(t, 2));
		
		System.out.println(u+a*t);
		// I gave "a" a numerical value
		// for ^ 2 use math.pow (t, 2) or t * t
	// for 1/2 keep it as 1.5
 
		System.out.println("Sunday");
		System.out.println("Monday");
		System.out.println("Tuesday");
		System.out.println("Wednesday");
		System.out.println("Thursday");
		System.out.println("Friday");
		System.out.println("Saturday");
		
		
		System.out.println("Java”+””+”is+””fun");
		
	}

}
