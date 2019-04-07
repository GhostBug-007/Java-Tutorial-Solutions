class BasicCalc{
	public int add(int a ,int b)
	{
		return a+b ;
	}
	public int sub(int a ,int b) 
	{
		return a-b ; 
	}
}

class ScientificCalc extends BasicCalc{
	public double sin(int deg){
		double rad = deg * 3.14159 / 180 ;
		return Math.sin(rad) ;
	}
}

public class Inheritance{
	public static void main(String [] args) {
		BasicCalc bcalc1 = new BasicCalc() ; 
		System.out.println(bcalc1.add(20,40) ) ; 
		System.out.println(bcalc1.sub(40,10) ); 

		ScientificCalc scalc1 = new ScientificCalc() ; 
		System.out.println(scalc1.add(20,60) );
		System.out.println(scalc1.sin(0)+"\n") ; 

		BasicCalc bcalc2 = new ScientificCalc() ;
		System.out.println(bcalc2.add(23,54)); 
		System.out.println(bcalc2.sub(54,23));
		System.out.println(((ScientificCalc)bcalc2).sin(90));
	}
}