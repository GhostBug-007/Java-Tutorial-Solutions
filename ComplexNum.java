class Complex{
	private double re, img ; 

	public Complex(){
		re = img = 0 ; 
	}

	public Complex(double r){
		re = r ;
		img = 0 ; 
	}
	public Complex(double a, double b) {
		re = a ;
		img = b;
	}

	public void print(){
		System.out.println(re+" + " + img+"i") ;
	}
}

public class ComplexNum{
	public static void main(String [] args){
		Complex c1 = new Sample() ; 
		Complex c2 = new Sample(3,8) ;
		Complex c3 = new Sample(5) ; 
		c1.print() ;
		c2.print() ; 
		c3.print() ; 
	}
}