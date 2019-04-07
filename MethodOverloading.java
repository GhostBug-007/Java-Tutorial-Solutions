class Sample{

	public void print(int a){
		System.out.println("int "+ a) ; 
	}
	public void print(String a){
		System.out.println("String "+a); 
	}
	public void print(double a, double b){
		System.out.println("double "+a+" "b);
	}
}

public class MethodOverloading{
	public static void main(String [] args){
		Sample x = new Sample() ; 
		x.print(5) ; 
		x.print("sdfadsf") ; 
		x.print(23,5234) ;
	}
}