class Sample {

	private int value ; 
	Sample(){
		value = 20; 
	}

	Sample(int n){
		value = n ;
	}
	public void print(){
		System.out.println(value) ; 
	}
}

public class Overloading{
	public static void main(String [] args){
		Sample s1 = new Sample() ; 

		Sample s = new Sample(100) ; 
		s1.print() ; 
		s.print();
	}
}