interface Calc{

	double PI = 3.14159 ;			//PUBLIC STATIC FINAL

	double add(double a, double b) ;	//public abstract class
	double sub(double a, double b) ;

}

class MyCalc implements Calc {
	@Override
	public double add(double a, double b){
		return a+b ; 
	}

	@Override
	public double sub(double a, double b){
		return a-b ;
	}

	public double sin(double deg){
		double radians = deg * PI/ 180 ;
		return Math.sin(radians) ;
	}
}

public class Interface_intro{
	public static void main(String [] args){

		MyCalc obj = new MyCalc() ; 
		System.out.println(obj.add(23,43));
		System.out.println(obj.sub(23,5));
		System.out.println(obj.sin(45));

		Calc c = new MyCalc() ;
		System.out.println(c.add(23,43));
		System.out.println(c.sub(23,5));
		// System.out.println(c.sin(45));

	}
}