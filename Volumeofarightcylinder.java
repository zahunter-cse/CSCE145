import java.util.Scanner;

public class Volumeofarightcylinder {

	public static final double PI = 3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating a scanner object
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the radiys(in inches) of the cylinder"); 
		
		double radius = key.nextDouble(); 
		
		double height = key.nextDouble();
		
		double voulume = PI * Math.pow(radius, 2) * height;
		
		//String volume;
		
	//	System.out.println("Voulume of the right cylinder = " + volume + "cubic inches");
		
	}

}
 