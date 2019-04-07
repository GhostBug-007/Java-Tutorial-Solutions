import java.util.Scanner ; 

public class Area{
	public static void main(String [] args){
		final double PI = 3.14159 ; 
		// double radius = 10 ;
		Scanner scan = new Scanner(System.in) ; 
		double radius; 
		System.out.println("Enter radius") ;
		radius = scan.nextDouble() ; 
		double area = PI * radius * radius; 
		System.out.println("The Area is " +area) ;
	}
}